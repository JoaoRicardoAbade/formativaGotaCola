import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class telaGerarJogos extends JFrame {
    private JFormattedTextField resultadoSorteioFormattedTextField;
    public telaGerarJogos() throws HeadlessException {
        setTitle("Gerar Jogo "); // título da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // operação padrão para fechar
        setSize(900, 600); // tamanho da tela
        setVisible(true);
        Container c = getContentPane(); // pegar o painel de conteúdo da tela
        c.setLayout(null);
        JLabel titulo = new JLabel("Gerar Jogo Aleatório");
        titulo.setSize(400, 30);
        titulo.setFont(new Font("Arial", Font.PLAIN, 30));
        titulo.setLocation(300, 30);
        c.add(titulo);
        Random r = new Random(); // sortear valores
        int valores[] = new int[6]; // armazenar os 6 valores sorteados
        for (int i = 0; i < valores.length; i++) {
            valores[i] = r.nextInt(60) + 1; // sortear numeros de 1 a 60
        }
        //String para mostrar os numeros sorteados
        StringBuilder resultado = new StringBuilder("O resultado é: ");
        for (int i = 0; i < valores.length; i++) {
            resultado.append(valores[i]);
            if (i < valores.length - 1) {
                resultado.append(", ");
            }
        }
        JLabel gerar = new JLabel(resultado.toString());
        gerar.setSize(800, 30);
        gerar.setFont(new Font("Arial", Font.PLAIN, 30));
        gerar.setLocation(100, 100);
        c.add(gerar);
    }
    public static void main(String[] args) {
        // para criar a tela na memória
        telaGerarJogos e = new telaGerarJogos ();
    }
}