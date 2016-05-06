package net.marcioreis.mapaufpa.ufpa;
import java.util.Random;

public class BlocoDeAula implements Comparable<BlocoDeAula> {
private int numeroDeSalas;
private int capacidadeDeAlunos=0;
private int codigoDoBloco;
	
public BlocoDeAula(int numeroDeSalas){
	if (numeroDeSalas>0)
	this.numeroDeSalas=numeroDeSalas;
	gerarCodigoBloco();
}
	public BlocoDeAula(int numeroDeSalas, int capacidadeDeAlunos){
		if (numeroDeSalas>0){
			this.numeroDeSalas=numeroDeSalas;
			this.capacidadeDeAlunos=capacidadeDeAlunos;	
			gerarCodigoBloco();
		}
	}
	public BlocoDeAula(BlocoDeAula bloco){
		this.numeroDeSalas=bloco.numeroDeSalas;
		this.capacidadeDeAlunos=bloco.capacidadeDeAlunos;
		this.codigoDoBloco=bloco.codigoDoBloco;
	}
	public int getNumeroDeSalas() {
		return numeroDeSalas;
	}
	public void setNumeroDeSalas(int numeroDeSalas) {
		this.numeroDeSalas = numeroDeSalas;
	}
	public int getCapacidadeDeAlunos() {
		return capacidadeDeAlunos;
	}
	public void setCapacidadeDeAlunos(int capacidadeDeAlunos) {
		this.capacidadeDeAlunos = capacidadeDeAlunos;
	}
	@Override
	public String toString() {
		return "BlocoDeAula [Salas=" + numeroDeSalas + ", Capacidade=" + capacidadeDeAlunos + "]";
	}
	@Override
	public int compareTo(BlocoDeAula outroBloco) {
		if (this.numeroDeSalas < outroBloco.numeroDeSalas) {
            return -1;
        }
        if (this.numeroDeSalas > outroBloco.numeroDeSalas) {
            return 1;
        }
		
		return 0;
	}
private void gerarCodigoBloco(){
	Random gerador = new Random();
    codigoDoBloco=gerador.nextInt();
}
public int getCodigoDoBloco() {
	return codigoDoBloco;
}	
	
}
