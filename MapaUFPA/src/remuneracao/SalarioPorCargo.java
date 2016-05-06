package remuneracao;

public enum SalarioPorCargo {
	 DIRETOR(10.00),
	 REITOR(25.00),
	 DIRERETORDEINSTITUTO(15.00);

	   private double salario;
	   private final double salarioMinimo=880.00;
	  
	   SalarioPorCargo(double numeroDeSalarioMinimo){
	   this.salario = numeroDeSalarioMinimo*salarioMinimo;
	  }

	   public double getSalario(){
	   return this.salario;
	  }
}
