import javax.swing.JOptionPane;

	public class Exercicio06{

		public static void main (String[]args){

		int pedido=0;
		int quantidadeProdutos = 1;
		int totalPreco = 0;
		double calculoPreco = 0;

		while(pedido!=16){
		pedido = Integer.parseInt(JOptionPane.showInputDialog(null,
		"PARA REALIZAR SEU PEDIDO DIGITE O CÓDIGO DO PRODUTO DESEJADO"+
		"\n"+
		"\n  1 - Bolos - Bolo Brigadeiro............................................................................R$ 29,50"+
		"\n  2 - Bolos - Bolo Floresta Negra......................................................................R$  2,00"+
		"\n  3 - Bolos - Bolo Leite com Nutella...............................................................R$ 29,23"+
		"\n  4 - Bolos - Bolo Mousse de Chocolate........................................................R$  7,10"+
		"\n  5 - Bolos - Bolo Nega Maluca.......................................................................R$ 19,33"+
		"\n  6 - Doces - Bomba de Creme.......................................................................R$ 17,71"+
		"\n  7 - Doces - Bomba de Morango....................................................................R$  4,82"+
		"\n  8 - Sanduíches - Filé-Mignon com fritas e cheddar................................R$ 21,16"+
		"\n  9 - Sanduíches - Hambúrguer com queijos, champignon e rúcula....R$ 12,70"+
		"\n10 - Sanduíches - Provolone com salame..................................................R$ 19,70"+
		"\n11 - Sanduíches - Vegetariano com berinjela...........................................R$ 28,22"+
		"\n12 - Pizzas - Calabresa.....................................................................................R$  8,98"+
		"\n13 - Pizzas - Napolitana....................................................................................R$  0,42"+
		"\n14 - Pizzas - Peruana.......................................................................................R$ 18,36"+
		"\n15 - Pizzas - Portuguesa.................................................................................R$ 27,50"+
		"\n16 - SAIR"
		));
		quantidadeProdutos = quantidadeProdutos + 1;
		}

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

		if(pedido == 1){
			calculoPreco = calculoPreco+29.50;
		}if(pedido == 2){
			calculoPreco = calculoPreco+2.00;
		}if(pedido == 3){
			calculoPreco = calculoPreco+29.23;
		}if(pedido == 4){
			calculoPreco = calculoPreco+7.10;
		}if(pedido == 5){
			calculoPreco = calculoPreco+19.33;
		}if(pedido == 6){
			calculoPreco = calculoPreco+17.71;
		}if(pedido == 7){
			calculoPreco = calculoPreco+4.82;
		}if(pedido == 8){
			calculoPreco = calculoPreco+21.16;
		}if(pedido == 9){
			calculoPreco = calculoPreco+12.70;
		}if(pedido == 10){
			calculoPreco = calculoPreco+19.70;
		}if(pedido == 11){
			calculoPreco = calculoPreco+28.22;
		}if(pedido == 12){
			calculoPreco = calculoPreco+8.98;
		}

		}
	}