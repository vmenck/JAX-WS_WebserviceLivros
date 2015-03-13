package clazz.data;

import java.util.Date;

public class Autor {
	private String nome;
	private Date dataNascimento;
		
	public Autor(String nome){
		this.nome = nome;
	}
	
	public Autor(String nome,Date dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public Autor(){}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
