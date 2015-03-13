package clazz.adaptor;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import clazz.data.Autor;

public class AdaptorAutores extends XmlAdapter<String, Autor> {

	@Override
	public String marshal(Autor autor) throws Exception {
		return autor.getNome();
	}

	@Override
	public Autor unmarshal(String autorName) throws Exception {
		return new Autor(autorName);
	}
}
