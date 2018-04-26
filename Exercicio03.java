import javax.swing.JOptionPane;

public class Exercicio03{

    public static void main (String[]args){
        
        JOptionPane.showInputDialog("Digite seu peso");

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        int contador = 1;

        while(peso>0 && peso<300){
            
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));

            contador = contador +1;
        }
        
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas que informou seu peso é: " + contador);
    }
}