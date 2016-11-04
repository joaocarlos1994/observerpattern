package br.com.hyperclass.observerpattern.usecabeca.jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {

	@Override
	public void actionPerformed(final ActionEvent event) {
		System.out.println("Don't do it, you might regret it");
	}

}
