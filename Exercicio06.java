import javax.swing.JOptionPane;

	public class Exercicio06{

		public static void main (String[]args){

		int pedido=0;
		int quantidadeProdutos = -1;
		double calculoPreco = 0;
		int bolos = 0, doces = 0, sanduiches = 0, pizzas = 0;

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
		}if(pedido == 13){
			calculoPreco = calculoPreco+0.42;
		}if(pedido == 14){
			calculoPreco = calculoPreco+18.36;
		}if(pedido == 15){
			calculoPreco = calculoPreco+27.50;
		}

		if((pedido == 1) || (pedido == 2) || (pedido == 3) || (pedido == 4) || (pedido == 5)){
			bolos = bolos+1;
		}if((pedido == 6) || (pedido == 7)){
			doces = doces+1;
		}if((pedido == 8) || (pedido == 9) || (pedido == 10) || (pedido == 11)){
			sanduiches = sanduiches+1;
		}if((pedido == 12) || (pedido == 13) ||(pedido == 14) | (pedido == 15)){
			pizzas = pizzas+1;
		}
		}
		JOptionPane.showMessageDialog(null,
		"A quantidade de produtos escolhidos é: "+quantidadeProdutos+
		"\nTotalizando R$ "+calculoPreco
		);

		JOptionPane.showMessageDialog(null,
		"A quantidade de bolos escolhidos é: "+bolos+
		"\nA quantidade de doces escolhidos é: "+doces+
		"\nA quantidade de sanduíches escolhidos é: "+sanduiches+
		"\nA quantidade de pizzas escolhidas é: "+pizzas+
		"\nA média dos produtos escolhidos é: "+(calculoPreco/quantidadeProdutos)
		);
		}
	}