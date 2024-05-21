import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLerJogos extends JFrame {
    public telaLerJogos() {
        setTitle("Escolher Números da Mega-Sena");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));

        JLabel instructionsLabel = new JLabel("Digite 6 números entre 1 e 60:");
        panel.add(instructionsLabel);

        JTextField[] textFields = new JTextField[6];

        for (int i = 0; i < 6; i++) {
            textFields[i] = new JTextField();
            panel.add(textFields[i]);
        }

        JButton submitButton = new JButton("Enviar");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    try {
                        int num = Integer.parseInt(textFields[i].getText());
                        if (num < 1 || num > 60) {
                            JOptionPane.showMessageDialog(telaLerJogos.this, "Por favor, insira números válidos entre 1 e 60.");
                            return;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(telaLerJogos.this, "Por favor, insira números válidos entre 1 e 60.");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(telaLerJogos.this, "Números válidos!");
                dispose(); // Fecha a janela após a validação
            }
        });

        add(panel);
    }
}
