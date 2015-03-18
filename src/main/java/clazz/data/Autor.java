package clazz.data;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Autor {
	private String nome;
	
	//if i don´t want to send this field to wsdl
	@XmlTransient
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
	
	@XmlElementWrapper(name="refs")
	@XmlElement(name="ref")
	public List<URL> getRefs() throws MalformedURLException
	{
		List<URL> list = new ArrayList<URL>();
		list.add(new URL("http://www.submarino.com.br"));
		list.add(new URL("http://www.saraiva.com.br"));
		list.add(new URL("http://www.americanas.com.br"));
		
		return list;
	}
}
