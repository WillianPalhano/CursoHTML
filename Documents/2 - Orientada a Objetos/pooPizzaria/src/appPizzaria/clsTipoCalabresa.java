
package appPizzaria;

import java.util.ArrayList;

public class clsTipoCalabresa extends clsPizza {

	
	public clsTipoCalabresa() {
		// TODO Auto-generated constructor stub
		
		strPreparo = new ArrayList<>();
		tempo = 15;
		valor = 20.00;
	}
	
	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		strPreparo.add("Base da massa");
		strPreparo.add("Molho");
		strPreparo.add("Queijo");
		strPreparo.add("Calabresa");
		
	}
	

}
