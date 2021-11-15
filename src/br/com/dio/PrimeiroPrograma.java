package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("Ricardo","Branco",33);
		Livro livro = new Livro();
		livro.setNome("Osho");
		livro.setNpag("34");
		
		System.out.println(livro);
	}

}

class Livro{
	
	private String nome;
	private String npag;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNpag() {
		return npag;
	}
	public void setNpag(String npag) {
		this.npag = npag;
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", npag=" + npag + "]";
	}
	
	
	
	
}
