package clazz.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import clazz.data.Autor;
import clazz.data.Livro;

@WebService
public class LivrosDataAccessServiceUsingOverload {
	
	@WebResult(name="livro")
	public List<Livro> listarLivros()
	{
		List<Livro> livros = new ArrayList<Livro>();
		
		Livro l1 = new Livro();
		l1.setNome("As cronicas de Nárnia");
		l1.setAutores(Arrays.asList(new Autor("C.S. Lewis")));
		l1.setEditora("WMF");
		l1.setResumo("");
		l1.setAnoPublicacao(2009);
		
		Livro l2 = new Livro();
		l2.setNome("O Senhor dos Anéis");
		l2.setAutores(Arrays.asList(new Autor("J.R.R, Tolkein")));
		l2.setEditora("WMF");
		l2.setResumo("Epic!");
		l2.setAnoPublicacao(2011);
		
		Livro l3 = new Livro();
		l3.setNome("Os tres escritores");
		l3.setAutores(Arrays.asList(new Autor("Escritor 1"),new Autor("Escritor 2"),new Autor("Escritor 3")));
		l3.setEditora("Uma qualquer");
		l3.setResumo("Sem pÃ© nem cabeÃ§a.");
		
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		return livros;
	}
	
	@RequestWrapper(className="clazz.methods.jaxws.ListarLivrosUmOuDois", localName="listarLivrosUmOuDois")
	@ResponseWrapper(className="clazz.methods.jaxws.ListarLivrosUmOuDoisResponse", localName="livrosUmOuDois")
	@WebResult(name="livros")
	@WebMethod(operationName="listarLivrosUmOuDois")
	public List<Livro> listarLivros(String umoudois)
	{
		List<Livro> livros = new ArrayList<Livro>();
		
		Livro l1 = new Livro();
		l1.setNome("O Pequeno Príncipe");
		l1.setAutores(Arrays.asList(new Autor("Alguem que nãoo conheço.")));
		l1.setEditora("Altabooks");
		l1.setResumo("Parecer ser legal..");
		l1.setAnoPublicacao(1852);
		
		Livro l2 = new Livro();
		l2.setNome("Sítio do pica-pau amarelo");
		l2.setAutores(Arrays.asList(new Autor("Monterio Lobato")));
		l2.setEditora("WTF");
		l2.setResumo("Infancia");
		l2.setAnoPublicacao(1987);
		
		if(umoudois.equals("1"))
			livros.add(l1);
		
		if(umoudois.equals("2"))
			livros.add(l2);
				
		return livros;
	}
}
