import javax.swing.JOptionPane;

public class Exercicio01{

    public static void main(String[]args){
        
        String nome = " ";
        
        JOptionPane.showInputDialog("Digite um nome. \nPara sair digite \"Fim\".");

            while(!nome.equalsIgnoreCase("fim")){
            nome = JOptionPane.showInputDialog("Digite um nome. \nPara sair digite \"Fim\".");
            }
            
    }
}