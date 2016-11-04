package br.com.hyperclass.observerpattern.usecabeca.observer1;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}
