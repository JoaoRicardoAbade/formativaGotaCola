import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class telaSortearJogos extends JFrame {
    private JFormattedTextField resultadoSorteioFormattedTextField;
    public telaSortearJogos() throws HeadlessException {
        setTitle("Resultado do sorteio"); // título da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // operação padrão para fechar
        setSize(900, 600); // tamanho da tela
        setVisible(true); // deixar visível para o usuário
        // desenhar a tela
        Container c = getContentPane(); // pegar o painel de conteúdo da tela
        c.setLayout(null); // configurar para não usar um layout pré-definido
        JLabel titulo = new JLabel("Resultado do sorteio");
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
        StringBuilder resultado = new StringBuilder("O resultado do sorteio é: ");
        for (int i = 0; i < valores.length; i++) {
            resultado.append(valores[i]);
            if (i < valores.length - 1) {
                resultado.append(", ");
            }
        }
        JLabel sorteio = new JLabel(resultado.toString());
        sorteio.setSize(800, 30);
        sorteio.setFont(new Font("Arial", Font.PLAIN, 30));
        sorteio.setLocation(100, 100);
        c.add(sorteio);
    }
    public static void main(String[] args) {
        // para criar a tela na memória
        telaSortearJogos e = new telaSortearJogos ();
    }
}