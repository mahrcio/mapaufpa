package net.marcioreis.mapaufpa.ufpa.pessoa;

import remuneracao.SalarioPorCargo;

public class Reitor extends Pessoa {
	private final int mandatoEmAnos=4;
	private SalarioPorCargo salario=SalarioPorCargo.REITOR;
	
	
	public Reitor(String nome,String sobrenome) {
		super(nome,sobrenome);
	}
	public Reitor(String nome,String sobrenome, int idade) {
		super(nome,sobrenome,idade);
	}
	public Reitor(Reitor reitor){
		super((Pessoa)reitor);
		//mandatoEmAnos=reitor.mandatoEmAnos;
	}
	public int getMandatoEmAnos() {
		return mandatoEmAnos;
	}
	@Override
	public String toString() {
		return "Reitor [Mandato=" + mandatoEmAnos + ", Salario=" + salario + "]";
	}
	public double getSalario() {
		return salario.getSalario();
	}

}
