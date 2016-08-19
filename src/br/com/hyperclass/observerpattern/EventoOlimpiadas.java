package br.com.hyperclass.observerpattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoOlimpiadas extends Evento {
	
	private final List<String> listaPublicacao;

	public EventoOlimpiadas(String nome, Date date, List<ObserverEvento> listObserverEvento) {
		super(nome, date, listObserverEvento);
		this.listaPublicacao = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
	
	public void adicionarNovaPublicacao(final String publicacao){
		listaPublicacao.add(publicacao);
		for (ObserverEvento observerEvento : listObserverEvento) {
			observerEvento.atualizacaoEvento(publicacao);
		}
	}

}
