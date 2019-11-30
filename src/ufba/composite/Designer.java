package ufba.composite;

public class Designer extends Pessoa {
	public Designer(String nome, double experiencia) {
		this.nome = nome;
		this.experiencia = experiencia;
	}
	public double getCusto() {
		return 800 * experiencia;
	}
}