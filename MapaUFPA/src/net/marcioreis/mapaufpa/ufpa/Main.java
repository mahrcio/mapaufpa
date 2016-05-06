package net.marcioreis.mapaufpa.ufpa;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import net.marcioreis.mapaufpa.endereco.Endereco;
import net.marcioreis.mapaufpa.ufpa.pessoa.Diretor;

public class Main {

	
	public static void main(String[] args) {
		int resposta = JOptionPane.showConfirmDialog(null, "Iniciar Criação da UFPA?");
		
		if (resposta==JOptionPane.YES_OPTION){
			Ufpa ufpa=new Ufpa();
			JOptionPane.showMessageDialog(null, "UFPA inicada c/ sede: Campus Guama");
			int menuPrincipal=Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n1-Novo >>\n2-Listar >>\n"));
			if (menuPrincipal==1){
				int menuNovo=Integer.parseInt(JOptionPane.showInputDialog("MENU\n\n1-Campus >>\n2-Instituto >>\n3- Bloco de Aula\n"));
				if (menuNovo==1){
					String nomeDoCampus = JOptionPane.showInputDialog("Nome do Campus:");
					String rua = JOptionPane.showInputDialog("Rua:");
					String numero = JOptionPane.showInputDialog("Numero:");
					String bairro = JOptionPane.showInputDialog("Bairro:");
					String cidade = JOptionPane.showInputDialog("Cidade:");
					try{
						ufpa.adicionarCampus(new Campus(nomeDoCampus, new Endereco(rua, numero, bairro, cidade)));	
						JOptionPane.showMessageDialog(null, "Campus adicionado!");
					}catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, "Não foi possivel criar e adicionar Campus");
					};//fim try
				}
					if (menuNovo==2){
						String nomeDoInstituto = JOptionPane.showInputDialog("Nome do Instituto:");
						String nome = JOptionPane.showInputDialog("Nome do Diretor:");
						String sobrenome = JOptionPane.showInputDialog("Sobrenome do Diretor:");
						try{
							ufpa.adicionarInstituto(new Instituto(nomeDoInstituto,new Diretor(nome, sobrenome)));	
							JOptionPane.showMessageDialog(null, "Instituto adicionado!");
						}catch(Exception e)
						{
							JOptionPane.showMessageDialog(null, "Não foi possivel criar e adicionar Instituto");
						};//fim try	
					}
						if (menuNovo==3){
							int numeroDeSalas = Integer.parseInt(JOptionPane.showInputDialog("Numero de Salas:"));
							int capacidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Capacidade de Alunos:"));
							int resposta1 = Integer.parseInt(JOptionPane.showInputDialog("Em qual Campus:\n"+ufpa.listarCampus()));
							
							try{
								ufpa.adicionarBlocoDeAula(new BlocoDeAula(numeroDeSalas,capacidadeDeAlunos),resposta1);	
								JOptionPane.showMessageDialog(null, "Bloco de Aula adicionado!");
							}catch(Exception e)
							{
								JOptionPane.showMessageDialog(null, "Não foi possivel criar e adicionar Bloco de Aula");
							};//fim try	
							}
			
		}
		
		
	}//if principal

}//main
}//classe

