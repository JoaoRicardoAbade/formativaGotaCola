import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaPrincipal extends JFrame{
    private JButton gerarJogos;
    private JButton sorteioDaMega;
    private JButton LerJogos;
    private JButton Sair;
    private JPanel painelPrincipal;

    public telaPrincipal()throws HeadlessException {
        setSize(900,600);
        setContentPane(painelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        LerJogos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaLerJogos i = new telaLerJogos();
            }
        });

        gerarJogos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaGerarJogos p= new telaGerarJogos();
            }
        });

        sorteioDaMega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaSortearJogos a= new telaSortearJogos();
            }
        });

        Sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
