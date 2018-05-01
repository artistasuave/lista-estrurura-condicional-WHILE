import javax.swing.JOptionPane;

public class Exercicio11{

    public static void main (String[]args){

        String produto = " ";
        double somaValor = 0;

            while(!produto.equalsIgnoreCase("sair")){
            produto = JOptionPane.showInputDialog(null, "Digite o nome do produto."+
            "\nSe desejar sair, digite \"SAIR\"");
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
            double quantidade = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos"));

            somaValor = somaValor + (valor*quantidade);
            }

        JOptionPane.showMessageDialog(null, "O valor total dos produtos com desconto de 5% é: R$ "+(somaValor*0.95));
    }
}