package br.com.hyperclass.observerpattern;

import java.util.Date;
import java.util.List;

public abstract class Evento {
	
	protected String nome;
	protected Date date;
	protected List<ObserverEvento> listObserverEvento;
	
	public Evento(String nome, Date date, List<ObserverEvento> listObserverEvento) {
		super();
		this.nome = nome;
		this.date = date;
		this.listObserverEvento = listObserverEvento;
	}
	
	

}
