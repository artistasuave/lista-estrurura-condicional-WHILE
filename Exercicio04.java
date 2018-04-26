import javax.swing.JOptionPane;

public class Exercicio04{

    public static void main (String[]args){

        double quantidadeCarros = 0;
        double totalAnos = 0;
        double totalPreco = 0;
        int contadorQuantidade = 0;
        int contadorA = 0;
        int contadorG = 0;

        quantidadeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que deseja cadastrar"));

        while (contadorQuantidade<quantidadeCarros){
            String modeloCarro = JOptionPane.showInputDialog("Digite o modelo do carro");
            double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro"));
            totalPreco = totalPreco + valorCarro;
            double anoCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano do carro"));
            totalAnos = totalAnos + anoCarro;

            char letra = modeloCarro.charAt(0);
                if(letra == Character.toLowerCase('A')){
                    contadorA = contadorA + 1;
                }else if(letra == Character.toLowerCase('G')){
                    contadorG = contadorG +1;
                }
            contadorQuantidade = contadorQuantidade + 1;
        }

        double mediaAno = totalAnos/quantidadeCarros;
        double mediaValor = totalPreco/quantidadeCarros;

        JOptionPane.showMessageDialog(null,
        "A média dos anos dos carros é: "+mediaAno+
        "\nA média dos valores dos carros é: "+mediaValor+
        "\nA quantidade de carros que começam com a letra A é: "+contadorA+
        "\nA quantidade de carros que começam com a letra G é: "+contadorG
        );
    
    }
}