
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Logan Michel
 */
public class Ex04L7 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite os Números.")));
        }
        JOptionPane.showMessageDialog(null, "Seus Números: " + numeros); 
        
        numeros.remove(numeros.get(3));
        
        JOptionPane.showMessageDialog(null, "Seus Números: " + numeros);
        
        numeros.remove(numeros.get(4));
        
        JOptionPane.showMessageDialog(null, "Seus Números: " + numeros);
    }
}
