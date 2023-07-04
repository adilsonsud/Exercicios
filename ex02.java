
import javax.swing.JOptionPane;

public class ex02 {
    public static void main (String arg[]){
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Seu nome e " + nome);
      }
}
