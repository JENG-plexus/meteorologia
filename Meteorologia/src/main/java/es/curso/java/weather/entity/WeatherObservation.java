package es.curso.java.weather.entity;


public class WeatherObservation {
	
	private String stationName;
	private int humidity;
	private int windSpeed;
	private double temperature;
	public WeatherObservation(String stationName, int humidity, int windSpeed, double temperature) {
		super();
		this.stationName = stationName;
		this.humidity = humidity;
		this.windSpeed = windSpeed;
		this.temperature = temperature;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	

}
