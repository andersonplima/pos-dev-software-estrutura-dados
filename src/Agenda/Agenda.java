package Agenda;

import java.util.Arrays;

public class Agenda {
	private static final int MAX_CONTATOS = 5;
	private Contato[] agenda;
	private int qtdeContatos;

	public Agenda() {
		qtdeContatos = 0;
		agenda = new Contato[MAX_CONTATOS];
	}

	public void adicionar(Contato contato) {
		if (qtdeContatos == 0) {
			agenda[qtdeContatos] = contato;
			++qtdeContatos;
		} else {
			int i = qtdeContatos - 1;

			// Desloca para frente enquanto for maior
			for (; i >= 0 && contato.getNome().compareToIgnoreCase(agenda[i].getNome()) > 0; --i)
				if (i + 1 != MAX_CONTATOS)
					agenda[i + 1] = agenda[i];

			if (i == qtdeContatos - 1) { // É o menor de todos
				if (qtdeContatos != MAX_CONTATOS) {
					agenda[qtdeContatos] = contato;
					++qtdeContatos;
				}
			} else {
				agenda[i + 1] = contato;
				if (qtdeContatos != MAX_CONTATOS)
					++qtdeContatos;
			}
		}
	}

	public Contato remover(String nome) {
		int posicao = indiceDe(nome);
		Contato contatoRemovido;
		if (posicao < 0) {
			System.out.println("Contato não encontrado!");
			contatoRemovido = null;
		} else {
			contatoRemovido = agenda[posicao];

			for (int i = posicao; i < qtdeContatos - 1; ++i)
				agenda[i] = agenda[i + 1];

			agenda[qtdeContatos - 1] = null;
			--qtdeContatos;			
		}
		
		return contatoRemovido;
	}

	private Contato buscar(String nome) {
		int i = 0;
		for (; i < qtdeContatos && !agenda[i].getNome().equalsIgnoreCase(nome); ++i)
			;

		if (i != qtdeContatos)
			return agenda[i];

		return null;
	}

	private int indiceDe(String nome) {
		int i = 0;
		for (; i < qtdeContatos && !agenda[i].getNome().equalsIgnoreCase(nome); ++i)
			;

		if (i != qtdeContatos)
			return i;

		return -1;
	}

	public void imprimir(String nome) {
		Contato contato = buscar(nome);
		if (contato != null)
			System.out.println(contato);
		else
			System.out.println("Contato não encontrado!");

		/*
		 * int posicao = qtdeContatos / 2; boolean encontrou = false;
		 * 
		 * while (!encontrou) { if (nome.compareTo(agenda[posicao].getNome()) > 0) {
		 * posicao = }
		 * 
		 * }
		 */
	}

	@Override
	public String toString() {
		return Arrays.toString(agenda);
	}

}
