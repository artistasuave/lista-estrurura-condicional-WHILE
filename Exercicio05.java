import javax.swing.JOptionPane;

public class Exercicio05{

    public static void main (String[]args){
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Insira mais um número"));
        String opcaoSelecionada = " ";
        
        while(!opcaoSelecionada.equals("5")){
        opcaoSelecionada = JOptionPane.showInputDialog(null,             
        "1 - SOMAR"+       
        "\n2 - SUBTRAIR"+     
        "\n3 - MULTIPLICAR"+     
        "\n4 - DIVIDIR"+
        "\n5 - SAIR"
        );
         if(opcaoSelecionada.equals(1)){
            JOptionPane.showMessageDialog(null, "A soma dos números é: "+(numero1+numero2));
        }else if(opcaoSelecionada.equals(2)){
            JOptionPane.showMessageDialog(null, "A subtração dos números é: "+(numero1-numero2));
        }else if(opcaoSelecionada.equals(3)){
            JOptionPane.showMessageDialog(null, "A multiplicação dos números é: "+(numero1*numero2));
        }else if(opcaoSelecionada.equals(4)){
            JOptionPane.showMessageDialog(null, "A divisão dos números é: "+(numero1/numero2));
        }
        }
    }
}