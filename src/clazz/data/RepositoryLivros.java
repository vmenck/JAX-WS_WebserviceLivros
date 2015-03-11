package clazz.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepositoryLivros {

	private static List<Livro> livros;
	
	static
	{
		livros = new ArrayList<Livro>();
		loadLivros();
	}
	
	public RepositoryLivros() {}	
	
	private static void loadLivros()
	{
		Livro l1 = new Livro();
		l1.setNome("A Arte da Guerra");
		l1.setAutores(Arrays.asList("Sun Tzu"));
		l1.setEditora("");
		l1.setResumo("“A Arte da Guerra” é um dos clássicos mais influentes do pensamento oriental sobre estratégia. Esta é a edição completa que nos traz com excelência os ensinamentos do general chinês Sun Tzu através dos treze capítulos originais, que a cerca de 2500 anos influencia o mundo dos negócios.");
		l1.setAnoPublicacao(2009);
		livros.add(l1);
		
		Livro l2 = new Livro();
		l2.setNome("O Monge e o Executivo");
		l2.setAutores(Arrays.asList("Hunter, James C"));
		l2.setEditora("");
		l2.setResumo("“");
		l2.setAnoPublicacao(2010);
		livros.add(l2);
		
		Livro l3 = new Livro();
		l3.setNome("Como Se Tornar um Líder Servidor");
		l3.setAutores(Arrays.asList("Hunter, James C"));
		l3.setEditora("");
		l3.setResumo("O novo livro de James C. Hunter - mesmo autor de O Monge e o Executivo -, tem dois objetivos: o primeiro é compilar de maneira simples, concisa e clara os princípios da liderança servidora apresentados em seu livro anterior. O segundo é proporcionar um guia que facilite a aplicação desses princípios em sua vida e no trabalho.“");
		l3.setAnoPublicacao(2011);
		livros.add(l3);
		
		Livro l4 = new Livro();
		l4.setNome("Os Segredos da Mente Milionária");
		l4.setAutores(Arrays.asList("Eker, T. Harv"));
		l4.setResumo("“");
		l4.setAnoPublicacao(2012);
		livros.add(l4);
		
		Livro l5 = new Livro();
		l5.setNome("A Tríade do Tempo");
		l5.setAutores(Arrays.asList("Barbosa, Christian"));
		l5.setEditora("");
		l5.setResumo("“");
		l5.setAnoPublicacao(2013);
		livros.add(l5);
		
		Livro l6 = new Livro();
		l6.setNome("O Fascinante Império de Steve Jobs");
		l6.setAutores(Arrays.asList("Moritz, Michael", "Assistente 1"));
		l6.setEditora("");
		l6.setResumo("“");
		l6.setAnoPublicacao(2014);
		livros.add(l6);
		
		Livro l7 = new Livro();
		l7.setNome("O Poder Dos Inquietos");
		l7.setAutores(Arrays.asList("Guillebeau, Chris", "Assistente 1","Assistente 2","Assistente 3"));
		l7.setEditora("");
		l7.setResumo("“");
		l7.setAnoPublicacao(2015);
		livros.add(l7);
		
		Livro l8 = new Livro();
		l8.setNome("As cronicas de Nárnia");
		l8.setAutores(Arrays.asList("C.S. Lewis"));
		l8.setEditora("WMF");
		l8.setResumo("");
		l8.setAnoPublicacao(2009);
		livros.add(l8);
		
		Livro l9 = new Livro();
		l9.setNome("O Senhor dos Anéis");
		l9.setAutores(Arrays.asList("J.R.R. Tolkein"));
		l9.setEditora("WMF");
		l9.setResumo("Epic!");
		l9.setAnoPublicacao(2011);
		livros.add(l9);
		
		Livro l10 = new EBook();
		l10.setNome("SOA Aplicado");
		l10.setAutores(Arrays.asList("Alexandre Saudate"));
		l10.setEditora("Casa do Código");
		l10.setResumo("Teste using JAXB");
		l10.setAnoPublicacao(2012);
		livros.add(l10);		
	}	
	
	public List<Livro> listarLivros()
	{
		return livros;
	}
	
	public List<Livro> searchByAutores(String authorName)
	{
		List<Livro> livrosPorAutores = new ArrayList<Livro>();
		
		for(Livro l : livros)
		{
			if(l.getAutores().contains(authorName))
			{
				livrosPorAutores.add(l);
			}
		}
		return livrosPorAutores;
	}
	
	public void addLivro(Livro livro)
	{
		livros.add(livro);
	}
}
