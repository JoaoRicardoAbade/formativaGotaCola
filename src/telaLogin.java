import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogin extends JFrame {
    private JPanel telaLogin;
    private JFormattedTextField textEmail;
    private JButton botaoLogar;
    private JButton botaoCancelar;
    private JButton botaoRegistrar;
    private JTextField textSenha;

    public telaLogin() throws HeadlessException {
        setSize(400, 250);
        setContentPane(telaLogin);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textEmail.getText().equals("Paulo")
                        &&
                        textSenha.getText().equals("Abacaxi")) {
                    telaInicial i = new telaInicial();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Usuário não encontrado ou senha incorreta!");
                }
            }
        });
        botaoRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaRegistro i = new telaRegistro();
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        telaLogin L = new telaLogin();
    }
}

