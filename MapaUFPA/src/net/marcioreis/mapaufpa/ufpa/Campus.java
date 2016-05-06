package net.marcioreis.mapaufpa.ufpa;

import java.util.ArrayList;

import net.marcioreis.mapaufpa.endereco.Endereco;
import net.marcioreis.mapaufpa.ufpa.pessoa.Diretor;

public class Campus {
	private String nomeDoCampus;
	private ArrayList<BlocoDeAula> listaDeBlocosDeaula= new ArrayList<BlocoDeAula>();
	private Endereco endereco;
	private Diretor diretor; 

	public Campus(String nomeDoCampus, Endereco endereco, Diretor diretor){
		this.nomeDoCampus=nomeDoCampus;
		this.endereco=endereco;
		this.diretor=diretor;
	}
	public Campus(String nomeDoCampus, Endereco endereco){
		this.nomeDoCampus=nomeDoCampus;
		this.endereco=endereco;
	}
	public Campus(Campus campus){
		this.nomeDoCampus=campus.nomeDoCampus;
		this.endereco=campus.endereco;
		this.listaDeBlocosDeaula=campus.listaDeBlocosDeaula;
	}

public void adicionarBlocoDeAula(BlocoDeAula novoBlocoDeAula){
	listaDeBlocosDeaula.add(novoBlocoDeAula);
}
public String getNomeDoCampus() {
	return nomeDoCampus;
}
public void setNomeDoCampus(String nomeDoCampus) {
	this.nomeDoCampus = nomeDoCampus;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

public boolean equals(Object objeto) {
	Campus outroCampus = (Campus) objeto;
    if (this.nomeDoCampus != outroCampus.nomeDoCampus) return false;
    if (this.endereco != outroCampus.endereco) return false;
    
    return true;
  }

}
