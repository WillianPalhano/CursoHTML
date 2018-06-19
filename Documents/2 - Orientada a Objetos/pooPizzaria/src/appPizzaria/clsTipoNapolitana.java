package appPizzaria;

import java.util.ArrayList;

public class clsTipoNapolitana extends clsPizza {
		
	
	public clsTipoNapolitana() {
		// TODO Auto-generated constructor stub
		strPreparo = new ArrayList<>();
		tempo = 12;
		valor = 25.00;
	}

	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		strPreparo.add("Base da massa");
		strPreparo.add("Molho");
		strPreparo.add("Queijo");
		strPreparo.add("Presunto");
		strPreparo.add("Tomate");
		strPreparo.add("Orégano");
		
	}


}
