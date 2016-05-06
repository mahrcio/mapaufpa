package net.marcioreis.mapaufpa.ufpa;

import java.util.ArrayList;

import net.marcioreis.mapaufpa.endereco.Endereco;
import net.marcioreis.mapaufpa.ufpa.pessoa.Diretor;

public class Instituto {
	private Diretor diretor;
	private String nomeDoInstituto;
	private Endereco endereco;
	private ArrayList<Faculdade> listaDeFaculdades;

	public Instituto(String nomeDoInstituto,Diretor diretor, Endereco endereco){
		this.nomeDoInstituto=nomeDoInstituto;
		this.diretor=diretor;
		this.endereco=endereco;
	}
	public Instituto(String nomeDoInstituto,Diretor diretor){
		this.nomeDoInstituto=nomeDoInstituto;
		this.diretor=diretor;
	}
	public Instituto(Instituto instituto){
		this.nomeDoInstituto=instituto.nomeDoInstituto;
		this.diretor=instituto.diretor;
		this.listaDeFaculdades=instituto.listaDeFaculdades;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public String getNomeDoInstituto() {
		return nomeDoInstituto;
	}
	public void setNomeDoInstituto(String nomeDoInstituto) {
		this.nomeDoInstituto = nomeDoInstituto;
	}
	@Override
	public String toString() {
		return "Instituto [Diretor=" + diretor + ", Nome do Inst.=" + nomeDoInstituto + "]";
	}
	
	
}
