package ufba.composite;

public class EstatisticasFinanceiras {
	// Custo de uma EUquipe
	public static void imprimeCustoProjeto(Membro membro) {
		System.out.println("Custo de " + membro.getNome() + ": " + membro.getCusto());
	}
	
	// Custo de uma equipe com várias pessoas
	public static void imprimeCustoProjeto(Equipe equipe) {
		System.out.println("Custo de " + equipe.getNome() + ": " + + equipe.getCusto());
	}
}