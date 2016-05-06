package net.marcioreis.mapaufpa.ufpa;

import net.marcioreis.mapaufpa.endereco.Endereco;
import net.marcioreis.mapaufpa.ufpa.pessoa.Reitor;

public abstract class Universidade {
	private String nomeDaUniversidade;
	private Reitor reitor;
	private Endereco enderecoSede;
	
	public Universidade(String nomeDaUniversidade, Reitor reitor){
		this.nomeDaUniversidade=nomeDaUniversidade;
		this.reitor=reitor;
		this.enderecoSede=enderecoSede;
	}
	public Universidade(String nomeDaUniversidade, Reitor reitor, Endereco enderecoSede){
		this.nomeDaUniversidade=nomeDaUniversidade;
		this.reitor=reitor;
	}
	public Universidade(Universidade universidade){
		this.nomeDaUniversidade=universidade.nomeDaUniversidade;
		this.reitor=universidade.reitor;
	}
	public String getNomeDaUniversidade() {
		return nomeDaUniversidade;
	}
	public void setNomeDaUniversidade(String nomeDaUniversidade) {
		this.nomeDaUniversidade = nomeDaUniversidade;
	}
	public Reitor getReitor() {
		return reitor;
	}
	public void setReitor(Reitor reitor) {
		this.reitor = reitor;
	}
	public Endereco getEnderecoSede() {
		return enderecoSede;
	}
	public void setEnderecoSede(Endereco enderecoSede) {
		this.enderecoSede = enderecoSede;
	}
	
}
