package clazz.main;

import javax.xml.ws.Endpoint;

import clazz.methods.LivrosDataAccess;

public class ExecWS {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/livros", new LivrosDataAccess());
		System.out.println("Service up and running!");
	}
}
