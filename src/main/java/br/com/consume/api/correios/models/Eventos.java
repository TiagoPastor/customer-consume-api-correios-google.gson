package br.com.consume.api.correios.models;

public class Eventos {
	
	private String tipoEvento;
	private String descricaoEvento;
	private String nomeUnidade;
	private String municipio;
	private String uf;
	private String dataCriacao;
	private String dataCriacaoAsDate;
	
	
	public String getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	public String getNomeUnidade() {
		return nomeUnidade;
	}
	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getDataCriacaoAsDate() {
		return dataCriacaoAsDate;
	}
	public void setDataCriacaoAsDate(String dataCriacaoAsDate) {
		this.dataCriacaoAsDate = dataCriacaoAsDate;
	}
	
	
	@Override
	public String toString() {
		return "Eventos [tipoEvento=" + tipoEvento + ", descricaoEvento=" + descricaoEvento + ", nomeUnidade="
				+ nomeUnidade + ", municipio=" + municipio + ", uf=" + uf + ", dataCriacao=" + dataCriacao
				+ ", dataCriacaoAsDate=" + dataCriacaoAsDate + "]";
	}
	
	
	
	
	
	

}
