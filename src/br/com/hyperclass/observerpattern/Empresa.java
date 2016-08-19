package br.com.hyperclass.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements ObserverEvento {
	
	private final String nome;
	private final List<Evento> listObserverEventos;
	
	

	public Empresa(String nome) {
		super();
		this.nome = nome;
		listObserverEventos = new ArrayList<>();
	}



	@Override
	public void atualizacaoEvento(final Evento evento) {
		// TODO Auto-generated method stub
		listObserverEventos.add(evento);
	}

}
