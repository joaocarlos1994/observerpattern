package br.com.hyperclass.observerpattern.usecabeca.observer1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private final List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(final Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(final Observer o) {
		final int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			final Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasureMents(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
