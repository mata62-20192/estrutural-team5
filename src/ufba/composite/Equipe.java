package ufba.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Equipe extends Membro{
	String nome;
	Collection<Pessoa> pessoas = new ArrayList<Pessoa>();
	Collection<Equipe> subequipes = new ArrayList<Equipe>();
	
	public Equipe(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	public void addSubequipe(Equipe subequipe) {
		subequipes.add(subequipe);
	}
	
	public double getCusto() {
		double total = 0;
		for (Pessoa pessoa : pessoas) {
			total += pessoa.getCusto();
		}
		for (Equipe subequipe : subequipes) {
			total += subequipe.getCusto();
		}
		return total;
	}	
}