package net.marcioreis.mapaufpa.ufpa;

import java.util.ArrayList;

import net.marcioreis.mapaufpa.endereco.Endereco;
import net.marcioreis.mapaufpa.ufpa.pessoa.Reitor;

public class Ufpa extends Universidade implements Vestibular{
	private static Endereco enderecoSede=new Endereco("Augusto Correa","01","Guama","Belem");
	private final static Campus campusSede=new Campus("Campus Guama", enderecoSede);
	public static ArrayList<Campus>listaDeCampus= new ArrayList<Campus>();
	private static ArrayList<Instituto> listaDeInstitutos=new ArrayList<Instituto>();

	public Ufpa(){
	super("UFPA", new Reitor("Carlos","Maneschy"));
	if (listaDeCampus.isEmpty())
		adicionarCampus(campusSede);
	}
	public Ufpa(Ufpa ufpa){
		super((Universidade)ufpa);
	}
	
	public void adicionarCampus(Campus novoCampus){
		listaDeCampus.add(novoCampus);
	}
	public void adicionarInstituto(Instituto novoInstituto){
		listaDeInstitutos.add(novoInstituto);
	}
	public String listarCampus(){
		String lista="";
		for (int i=0; i<listaDeCampus.size();i++){
			lista=lista+"\n"+i+"- "+listaDeCampus.get(i).getNomeDoCampus();
		}
		return lista;
		
	}
	public void adicionarBlocoDeAula(BlocoDeAula novoBloco, int i){
		listaDeCampus.get(i).adicionarBlocoDeAula(novoBloco);
	}
	@Override
	public void realizarVestibular() {
		System.out.println("Vestibular realizado na Data 28/02");
		
	}
	@Override
	public void divulgaResultado() {
		System.out.println("O resultado foi divulgado!!");
	}
	public static Endereco enderecoSede() {
		return enderecoSede;
	}
	public static Campus campusSede() {
		return campusSede;
	}
	
}
