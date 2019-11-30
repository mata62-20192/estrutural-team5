package ufba.composite;

public abstract class Pessoa extends Membro {
	String nome;
	double experiencia;
	
	public String getNome() {
		return this.nome;
	}
	
	public double getExperiencia() {
		return this.experiencia;
	}
	
	public abstract double getCusto();
}