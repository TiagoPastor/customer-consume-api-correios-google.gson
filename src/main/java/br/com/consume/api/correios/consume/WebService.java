package br.com.consume.api.correios.consume;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class WebService {
	
	
	private static String URI = "https://cws.correios.com.br/areletronico/v1/ars/";
    private static String userpass = "user" + ":" + "password";
    
    
	
	public HttpURLConnection getConexao(String caminho) {
		HttpURLConnection conexao = null;
		
		try {
			URL url = new URL(URI+caminho);
		    conexao = (HttpURLConnection) url.openConnection();
		    String basicAuth = "Basic " +new String(Base64.getEncoder().encode(userpass.getBytes()));
		    conexao.setRequestProperty("Authorization", basicAuth);
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conexao;
		
	}
	
}