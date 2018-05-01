import javax.swing.JOptionPane;

public class Exercicio09{

    public static void main (String[]args){

        String texto = JOptionPane.showInputDialog(null, "Digite um texto qualquer");
        String letra = " ";
        int caracteres = texto.length( );

        while(caracteres>=0){
            letra = letra+"\n"+texto.charAt(contador)
        }
        
    }
}