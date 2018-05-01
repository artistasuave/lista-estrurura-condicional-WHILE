import javax.swing.JOptionPane;

public class Exercicio12{

    public static void main (String[]args){

        int quantidade = 0;
        double valor = 0;
        
        while(quantidade<5){
            String produto = JOptionPane.showInputDialog("Digite o nome do produto");
            valor = JOptionPane.showInputDialog("Digite o valor do produto");
            quantidade = JOptionPane.showInputDialog("Digite a quantidade de produtos");
        }
    }
}