package es.curso.java.weather.entity;

public class Bbox {

	private double east;
	private double north;
	private double west;
	private double south;
	
	
	
	
	
	public Bbox(double east, double north, double west, double south) {
		super();
		this.east = east;
		this.north = north;
		this.west = west;
		this.south = south;
	}
	
	
	public double getEast() {
		return east;
	}
	public void setEast(double east) {
		this.east = east;
	}
	public double getNorth() {
		return north;
	}
	public void setNorth(double north) {
		this.north = north;
	}
	public double getWest() {
		return west;
	}
	public void setWest(double west) {
		this.west = west;
	}
	public double getSouth() {
		return south;
	}
	public void setSouth(double south) {
		this.south = south;
	}
	

	
}