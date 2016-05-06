package net.marcioreis.mapaufpa.ufpa.pessoa;

import remuneracao.SalarioPorCargo;

public class DiretorDeInstituto extends Diretor{
	private String institutoQueAdministra;
	private SalarioPorCargo salario=SalarioPorCargo.DIRERETORDEINSTITUTO;
	
	public DiretorDeInstituto(String nome, String sobrenome, String institutoQueAdministra){
		super(nome,sobrenome);
		this.institutoQueAdministra=institutoQueAdministra;
	}
	
	public DiretorDeInstituto(String nome, String sobrenome,int idade, String institutoQueAdministra){
		super(nome,sobrenome,idade);
		this.institutoQueAdministra=institutoQueAdministra;
	}
	public DiretorDeInstituto(DiretorDeInstituto diretor){
		super((Diretor)diretor);
		this.institutoQueAdministra=diretor.institutoQueAdministra;
	}
	public String getInstitutoQueAdministra() {
		return institutoQueAdministra;
	}
	public void setInstitutoQueAdministra(String institutoQueAdministra) {
		this.institutoQueAdministra = institutoQueAdministra;
	}
	@Override
	public String toString() {
		return "Diretor De Instituto [Instituto Que Administra=" + institutoQueAdministra +"Salário:"+salario+ "]";
	}
	
	

}
