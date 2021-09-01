package br.com.consume.api.correios.models;

import java.util.List;

public class ObjetoAR {
	
	private String codigo;
	private String imagemBase64;
	private String mensagem;
	private List<Eventos> eventos;
	private String tipo;
	private String dataCriacaoImagem;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getImagemBase64() {
		return imagemBase64;
	}
	public void setImagemBase64(String imagemBase64) {
		this.imagemBase64 = imagemBase64;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public List<Eventos> getEventos() {
		return eventos;
	}
	public void setEventos(List<Eventos> eventos) {
		this.eventos = eventos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDataCriacaoImagem() {
		return dataCriacaoImagem;
	}
	public void setDataCriacaoImagem(String dataCriacaoImagem) {
		this.dataCriacaoImagem = dataCriacaoImagem;
	}
	
	
	@Override
	public String toString() {
		return "ObjetoAR [codigo=" + codigo + ", imagemBase64=" + imagemBase64 + ", mensagem=" + mensagem + ", eventos="
				+ eventos + ", tipo=" + tipo + ", dataCriacaoImagem=" + dataCriacaoImagem + "]";
	}
	
	
	
	


}
