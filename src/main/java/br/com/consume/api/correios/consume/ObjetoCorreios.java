package br.com.consume.api.correios.consume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import br.com.consume.api.correios.models.ObjetoAR;
import br.com.consume.api.correios.util.Util;

public class ObjetoCorreios {
	
	private WebService webService;
	private static int codigoSucesso = 200;
	
	
	public ObjetoCorreios() {
		
		webService = new WebService();
	}
	
	
	public String getVersao() {
		String versao = null;
		
        try {
        	HttpURLConnection conexao =  webService.getConexao("versao");
        	BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
        	versao = Util.converteJsonEmString(resposta);
        	
            if (conexao.getResponseCode() != codigoSucesso) {
				
				throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
				
			}
        	
        	conexao.disconnect();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return versao;
		
	}
	
	public List<ObjetoAR> getRecurso(String objetoInput, String recurso){
		
		List<ObjetoAR> objetosAR = new ArrayList();
		
		try {
			HttpURLConnection conexao =  webService.getConexao(recurso);
			conexao.setRequestMethod("POST");
		    conexao.setRequestProperty("Content-type", "application/json");
		    conexao.setDoOutput(true);
		    conexao.setDoInput(true);
		    
		    OutputStream os = conexao.getOutputStream();
		    os.write(objetoInput.toString().getBytes());
			os.flush();
			
			if (conexao.getResponseCode() != codigoSucesso) {
				
				throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
				
			}

        	BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
        	String jsonEmString  = Util.converteJsonEmString(resposta);
        	
        	Gson gson = new Gson();
        	
        	ObjetoAR[] ob = gson.fromJson(jsonEmString, ObjetoAR[].class);
        	
        	objetosAR = Arrays.asList(ob);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return objetosAR;
		
	}
	

}
