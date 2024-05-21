import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class telaRegistro extends JFrame {
    private JPanel telaRegistrar;
    private JTextField textEmail;
    private JTextField textSenha;
    private JCheckBox aoClicarVoceAceitaraCheckBox;
    private JButton botaoCriarConta;
    private JButton botaoCancelar;



    public telaRegistro() throws HeadlessException{

        setSize(400, 250);
        setContentPane(telaRegistrar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        botaoCriarConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaLogin i = new telaLogin();
                dispose();

            }


        });
    }
}

