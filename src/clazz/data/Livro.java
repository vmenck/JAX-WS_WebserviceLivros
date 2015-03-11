package clazz.data;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import clazz.adaptor.DateAdaptor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({EBook.class})
public class Livro {
	
	private String nome;
	
	@XmlElementWrapper(name="autores")
	@XmlElement(name="autor")
	private List<String> autores;
	
	private String editora;
	
	private Integer anoPublicacao;
	
	private String resumo;
	
	@XmlJavaTypeAdapter(DateAdaptor.class)
	private Date dataCriacao = new Date();
	
	public Livro(){}
		
	public Livro(String nome, List<String> autores, String editora,
			Integer anoPublicacao, String resumo) {
		super();
		this.nome = nome;
		this.autores = autores;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.resumo = resumo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
