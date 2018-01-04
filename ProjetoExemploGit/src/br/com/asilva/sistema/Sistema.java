package br.com.asilva.sistema;

public class Sistema {

	public Sistema() {
		super();
	}
	
	public String sistema() {
		
		return System.getProperty("os.name");
	}
}
