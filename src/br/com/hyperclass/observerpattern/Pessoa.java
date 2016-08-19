package br.com.hyperclass.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Pessoa implements ObserverEvento {

	@SuppressWarnings("unused")
	private final String nome;
	private final List<String> listaItensPublicados;
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.listaItensPublicados = new ArrayList<>();
	}

	@Override
	public void atualizacaoEvento(String publicacao) {
		listaItensPublicados.add(publicacao);
	}

	public List<String> getListaItensPublicados() {
		return listaItensPublicados;
	}
	
	
}
