package br.com.hyperclass.observerpattern.usecabeca.observer2;

public class Main {

	public static void main(String[] args) {
		
		final WeatherData weatherData = new WeatherData();
		final CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasureMents(80, 65, 30.4f);
	}

}
