package br.com.hyperclass.observerpattern.usecabeca.observer2;

import java.util.Observable;
import java.util.Observer;

import br.com.hyperclass.observerpattern.usecabeca.observer1.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(final Observable observable) {
		super();
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			final WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
