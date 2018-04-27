import javax.swing.JOptionPane;

	public class Exercicio06{

		public static void main (String[]args){

		int pedido=0;
		int quantidadeProdutos = 1;
		int totalPreco = 0;

		while(pedido!=16){

		pedido = Integer.parseInt(JOptionPane.showInputDialog(null,
		"Para realizar seu pedido, digite o código do produto desejado"+
		"\n|------------------------------------------------------------------------------|"+
		"\n| CÓDIGO |    TIPO    |                    NOME                     |   VALOR  |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   1    | Bolos      | Bolo Brigadeiro                             | R$ 29,50 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   2    | Bolos      | Bolo Floresta Negra                         |  R$ 2,00 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   3    | Bolos      | Bolo Leite com Nutella                      | R$ 29,23 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   4    | Bolos      | Bolo Mousse de Chocolate                    |  R$ 7,10 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   5    | Bolos      | Bolo Nega Maluca                            | R$ 19,33 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   6    | Doces      | Bomba de Creme                              | R$ 17,71 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   7    | Doces      | Bomba de Morango                            |  R$ 4,82 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   8    | Sanduíches | Filé-Mignon com fritas e cheddar            | R$ 21,16 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   9    | Sanduíches | Hambúrguer com queijos, champignon e rúcula | R$ 12,70 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   10   | Sanduíches | Provolone com salame                        | R$ 19,70 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   11   | Sanduíches | Vegetariano com berinjela                   | R$ 28,22 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   12   | Pizzas     | Calabresa                                   |  R$ 8,98 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   13   | Pizzas     | Napolitana                                  |  R$ 0,42 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   14   | Pizzas     | Peruana                                     | R$ 18,36 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   15   | Pizzas     | Portuguesa                                  | R$ 27,50 |"+
		"\n|------------------------------------------------------------------------------|"+
		"\n|   16                |                    SAIR                                |"+
		"\n|------------------------------------------------------------------------------|"
		));

		quantidadeProdutos = quantidadeProdutos + 1;
		double produto1 = 29.50;
		double produto2 = 2.00;
		double produto3 = 29.23;
		double produto4 = 7.10;
		double produto5 = 19.33;
		double produto6 = 17.71;
		double produto7 = 4.82;
		double produto8 = 21.16;
		double produto9 = 12.70;
		double produto10 = 19.70;
		double produto11 = 28.22;
		double produto12 = 8.98;
		double produto13 = 0.42;
		double produto14 = 18.36;
		double produto15 = 27.50;

		totalPreco = 

		}
		JOptionPane.showMessageDialog(null,
		"A quantidade de produtos escolhidos é: "+quantidadeProdutos+
		"\nTotalizando R$ "+
		);

		}
	}

