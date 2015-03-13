package clazz.data;

import java.util.List;

public class EBook extends Livro {
	private FormatEBook formato = FormatEBook.PDF;

	public EBook() {
		super();
	}

	public EBook(String nome, List<Autor> autores, String editora,
			Integer anoPublicacao, String resumo) {
		super(nome,autores,editora,anoPublicacao,resumo);
	}

	public FormatEBook getFormato() {
		return formato;
	}

	public void setFormato(FormatEBook formato) {
		this.formato = formato;
	}

}
