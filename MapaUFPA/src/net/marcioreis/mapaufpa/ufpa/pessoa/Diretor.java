package net.marcioreis.mapaufpa.ufpa.pessoa;

import net.marcioreis.mapaufpa.ufpa.BlocoDeAula;
import remuneracao.SalarioPorCargo;

public class Diretor extends Pessoa{
private final int mandatoEmAnos=2;
private int numeroDePessoasDirigidas;
private SalarioPorCargo salario=SalarioPorCargo.DIRETOR;
	
	public Diretor(String nome,String sobrenome) {
		super(nome,sobrenome);
	}
	public Diretor(String nome,String sobrenome, int idade) {
		super(nome,sobrenome,idade);
	}
	public Diretor(Diretor diretor){
		super((Pessoa)diretor);
		
	}
	public int getMandatoEmAnos() {
		return mandatoEmAnos;
	}
	@Override
	public String toString() {
		return "Diretor [Nome: "+getNome()+getSobrenome()+"\nMandato=" + mandatoEmAnos +"Salário: "+salario+  "]";
	}
	
	
	public int compareTo(Diretor diretor) {
		if (this.numeroDePessoasDirigidas < diretor.numeroDePessoasDirigidas) {
            return -1;
        }
        if (this.numeroDePessoasDirigidas > diretor.numeroDePessoasDirigidas) {
            return 1;
        }
		
		return 0;
	}
	public double getSalario() {
		return salario.getSalario();
	}	
	
}
