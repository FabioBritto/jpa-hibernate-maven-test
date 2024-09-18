package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1,"Fabio Britto","fabio.tritono@gmail.com");
		Pessoa p2 = new Pessoa(2,"Priscila Britto","priscila.tritono@gmail.com");
		Pessoa p3 = new Pessoa(3,"Ana Britto","ana.tritono@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
