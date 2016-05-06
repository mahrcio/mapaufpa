package net.marcioreis.mapaufpa.endereco;

public class Endereco {
private String rua,numero,bairro,cidade;
private static final String pais="Brasil";

public Endereco(String rua, String numero, String bairro, String cidade) {
this.rua=rua;
this.numero=numero;
this.bairro=bairro;
this.cidade=cidade;
}

public Endereco(String rua, String numero, String cidade) {
this.rua=rua;
this.numero=numero;
this.cidade=cidade;
}
public Endereco(Endereco endereco){
	this.rua=endereco.rua;
	this.numero=endereco.numero;
	this.bairro=endereco.bairro;
	this.cidade=endereco.cidade;
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
@Override
public String toString() {
	return "Endereco [Rua=" + rua + ", Nr=" + numero + ", Bairro=" + bairro + ", Cidade=" + cidade + "]";
}

public static String getPais() {
	return pais;
}
public boolean equals(Object objeto) {
	Endereco outroEndereco = (Endereco) objeto;
    if (this.rua != outroEndereco.rua) return false;
    if (this.numero != outroEndereco.numero) return false;
    if (this.bairro != outroEndereco.bairro) return false;
    if (this.cidade != outroEndereco.cidade) return false;
    
    return true;
  }


}
