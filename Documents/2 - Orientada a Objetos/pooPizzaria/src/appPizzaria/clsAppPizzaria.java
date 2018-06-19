package appPizzaria;

import javax.swing.JOptionPane;

public class clsAppPizzaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Instancia a pizzaria
			clsPizza pizza = new clsPizza();
			
			int menu = Integer.parseInt(JOptionPane.showInputDialog("Qual pizza deseja: (1) calabresa ou (2) napolitana"));
			
			switch (menu) {
			case 1: 

				tipoCalabresa(pizza);
	
			    break;
			case 2: 
				
				tipoNapolitana(pizza);
				
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

	private static void tipoNapolitana(clsPizza pizza) {
		// Polimorfismo 
		clsPizza napo = new clsTipoNapolitana();
		pizza.Producao(napo);
		
		System.out.println("Tempo de preparo: " + napo.getTempo());
		System.out.println("Valor: " + napo.getValor());
		
		// concatena os produtos para a apresenta��o
		String produtos = "";
		for (int i = 0; i < napo.getStrPreparo().size(); i++) {
			produtos += napo.getStrPreparo().get(i) + ", ";
		}
		produtos = produtos.substring(0, produtos.length()-2); // retira o �ltimo string ", "
		
		System.out.println("Ingredientes: " + produtos);
		
	}

	private static void tipoCalabresa(clsPizza pizza){
			// Polimorfismo 
			clsPizza calabresa = new clsTipoCalabresa();
			pizza.Producao(calabresa);
			
			System.out.println("Tempo de preparo: " + calabresa.getTempo());
			System.out.println("Valor: " + calabresa.getValor());
			
			// concatena os produtos para a apresenta��o
			String produtos = "";
			for (int i = 0; i < calabresa.getStrPreparo().size(); i++) {
				produtos += calabresa.getStrPreparo().get(i) + ", ";
			}
			produtos = produtos.substring(0, produtos.length()-2); // retira o �ltimo string ", "
			
			System.out.println("Ingredientes" + produtos);
	}
}
