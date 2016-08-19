package br.com.hyperclass.observerpattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Augusto");
		Pessoa pessoa2 = new Pessoa("Guilherme");
		
		List<ObserverEvento> observerEventos = new ArrayList<>();		
		observerEventos.add(pessoa);

		
		EventoOlimpiadas eventoOlimpiadas = new EventoOlimpiadas("Rio 2016", new Date(), observerEventos);
		eventoOlimpiadas.adicionarNovaPublicacao("Brasil vai ganhar 8 a 1 da Alemanha");
		
		
		for (String publicacao : pessoa.getListaItensPublicados()) {
			System.out.println(publicacao);
		}
		
		for (String publicacao : pessoa2.getListaItensPublicados()) {
			System.out.println(publicacao);
		}
		
		
	}

}
