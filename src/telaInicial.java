import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaInicial extends JFrame{
    private JPanel telaInicial;
    private JButton botaoLogar;
    private JButton botaoRegistrar;

    public telaInicial() throws HeadlessException{
        setSize(400, 250);
        setContentPane(telaInicial);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaLogin i = new telaLogin();
                dispose();
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
    public static void main(String[] args){
        telaInicial L = new telaInicial();
    }
}
