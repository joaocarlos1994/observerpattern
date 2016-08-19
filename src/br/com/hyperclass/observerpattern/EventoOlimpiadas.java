package br.com.hyperclass.observerpattern;

import java.util.Date;
import java.util.List;

public class EventoOlimpiadas extends Evento{

	public EventoOlimpiadas(String nome, Date date, List<ObserverEvento> listObserverEvento) {
		super(nome, date, listObserverEvento);
		// TODO Auto-generated constructor stub
	}

}
