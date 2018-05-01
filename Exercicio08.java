import javax.swing.JOptionPane;

public class Exercicio08{

    public static void main (String[]args){

        int contadorQuantidade = 0;
        String textoDigitado = " ";
        
        int quantidadeCaracteres = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Você poderá digitar uma palavra ou frase a seguir."+
        "\nPorém antes, informe o número de caracteres que serão digitados: "));

        while(contadorQuantidade<quantidadeCaracteres){
            char caractere = JOptionPane.showInputDialog(null, "Insira o caractere").charAt(0);
            
            textoDigitado = textoDigitado + caractere;
            
            contadorQuantidade = contadorQuantidade + 1;
        }

        JOptionPane.showMessageDialog(null, "O texto digitado é: "+textoDigitado);
    }
}