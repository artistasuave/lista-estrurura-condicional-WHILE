import javax.swing.JOptionPane;

public class Exercicio07{

    public static void main(String[]args){

        String nome = " ", sexo = " ";
        int idade = 0, gols = 0, cartoesAmarelos = 0, cartoesVermelhos = 0, jogadores = 0, contador = 1;
        double peso = 0, maiorPeso = Integer.MIN_VALUE, menorPeso = Integer.MAX_VALUE, altura = 0;
        
        //NÃO ESQUECER DE MUDAR O NÚMERO DO CONTADOR
        while(contador<=3){
        nome = JOptionPane.showInputDialog(null, "Informe seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso"));
        sexo = JOptionPane.showInputDialog(null,
        "Selecione o sexo",
        "SEXO",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
            " ", "Feminino", "Masculino"
        },
         ""
        ).toString();
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua altura"));
        gols = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de gols marcados"));
        cartoesAmarelos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de Cartões Amarelos"));
        cartoesVermelhos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de Cartões Vermelhos"));
        
        contador = contador + 1;

        if (peso>maiorPeso){
            maiorPeso = peso;
        }else if(peso<menorPeso){
            menorPeso = peso;
        }
        
        }

        JOptionPane.showMessageDialog(null,
        "O jogador com o menor peso é: "+menorPeso);
        /*"\nO jogador com a maior altura é: "+
        "\nO jogador com o maior nome é: "+
        "\nA quantidade de jogadores do sexo F: "+
        "\nA quantidade de jogadores do sexo M: "+
        "\nO jogador com a menor quantidade de cartões amarelos recebidos é: "
        "\nO jogador com o menor nome é: "+
        "\nO jogador com o maior peso é: "+
        "\nO jogador com a maior quantidade de cartões vermelhos recebidos é: "+
        "\nO jogador com a maior quantidade de cartões amarelos recebidos é: "+
        "\nO jogador com a menor quantidade de cartões vermelhos recebidos é: "
        );*/
    }
}