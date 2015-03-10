package clazz.methods;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;

import clazz.data.Livro;
import clazz.data.RepositoryLivros;
import clazz.data.Usuario;
import clazz.faults.UsuarioNaoAutorizadoException;

@WebService
public class LivrosDataAccess {
		
	@WebResult(name="livro")
	public List<Livro> listarLivros()
	{
		return new RepositoryLivros().listarLivros();
	}	

	@WebResult(name="livros")
	public List<Livro> listarLivrosPorAutor(@WebParam(name="author") String autor)
	{
		return new RepositoryLivros().searchByAutores(autor);
	}
	
	public void criarLivro(@WebParam(name="livro") Livro livro, @WebParam(name="usuario",header=true) Usuario usuario)
	throws UsuarioNaoAutorizadoException, SOAPException
	{
		if(usuario.getLogin().equals("vmenck") && usuario.getPassword().equals("vmenck")){
			new RepositoryLivros().addLivro(livro);
		}else{
			throw new UsuarioNaoAutorizadoException("Não autorizado");
		}
	}
}
