package br.com.consume.api.correios.teste;

import java.util.List;

import br.com.consume.api.correios.consume.ObjetoCorreios;
import br.com.consume.api.correios.models.ObjetoAR;

public class TesteMain {

	public static void main(String[] args) {
		
		ObjetoCorreios objetoCorreios = new ObjetoCorreios();
		
		
	    String objetoInput = "{\r\n"
		+ "\"objetos\": [\r\n"
		+ "    \"BR469709121BR\",\r\n"
		+ "    \"BR469709135BR\",\r\n"
		+ "    \"BR469707899BR\",\r\n"
		+ "    \"BR469698239BR\"\r\n"
		+ "    ]\r\n"
		+ "}";
	    
	    System.out.println(objetoInput);
		
		List<ObjetoAR> objEventos =  objetoCorreios.getRecurso(objetoInput, "eventos");
		//List<ObjetoAR> objEventos =  objetoCorreios.getRecurso(objetoInput, "primeiroevento");
		//List<ObjetoAR> objEventos =  objetoCorreios.getRecurso(objetoInput, "ultimoevento");
		
		for (ObjetoAR obj : objEventos) {
			
			System.out.println("\ngetEventos: "+obj);
		}


	}

}
