package net.marcioreis.mapaufpa.ufpa;

import java.util.ArrayList;

import net.marcioreis.mapaufpa.ufpa.pessoa.Pessoa;


public class Faculdade implements MatriculaAluno {
private String nomeDaFaculdade;
private ArrayList<String>listaDeCursos;
private int numeroDeAlunos;


public Faculdade(String nomeDaFaculdade){
	this.nomeDaFaculdade=nomeDaFaculdade;
}
public Faculdade(String nomeDaFaculdade, int numeroDeAlunos){
	if (numeroDeAlunos>0){
		this.nomeDaFaculdade=nomeDaFaculdade;
		this.numeroDeAlunos=numeroDeAlunos;
	}
}
public Faculdade(Faculdade faculdade){
	this.nomeDaFaculdade=faculdade.nomeDaFaculdade;
}

@Override
public void realizarMatricula(Pessoa p) {
	System.out.println("Matricula feita do aluno "+p);	
}

@Override
public void gerarComprovanteDeMatricula(Pessoa p) {
	System.out.println("Imprimindo comprovante do aluno "+p);
	
}
public String getNomeDaFaculdade() {
	return nomeDaFaculdade;
}
public void setNomeDaFaculdade(String nomeDaFaculdade) {
	this.nomeDaFaculdade = nomeDaFaculdade;
}
public int getNumeroDeAlunos() {
	return numeroDeAlunos;
}
public void setNumeroDeAlunos(int numeroDeAlunos) {
	this.numeroDeAlunos = numeroDeAlunos;
}


}
