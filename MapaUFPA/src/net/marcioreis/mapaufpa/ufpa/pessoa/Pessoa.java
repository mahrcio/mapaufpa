package net.marcioreis.mapaufpa.ufpa.pessoa;

import net.marcioreis.mapaufpa.ufpa.BlocoDeAula;

public class Pessoa implements Comparable<Pessoa>{
private String nome, sobrenome;
private int idade;
public static final int idadeMinimaParaVotar=16;


public Pessoa(String nome, String sobrenome){
	this.nome=nome;
	this.sobrenome=sobrenome;
}

public Pessoa(String nome, String sobrenome, int idade){
	
	if (idade>=0){
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.idade=idade;
	}
}


public Pessoa(Pessoa pessoa){
	this.nome=pessoa.nome;
	this.sobrenome=pessoa.sobrenome;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

@Override
public String toString() {
	return "Pessoa [Nome=" + nome + ", Sobrenome=" + sobrenome + "]";
}

@Override
public int compareTo(Pessoa pessoa) {
	if (this.idade< pessoa.idade) {
        return -1;
    }
    if (this.idade> pessoa.idade) {
        return 1;
    }
	return 0;
}

public static int idadeMinimaParaVotar() {
	return idadeMinimaParaVotar;
}



}
