package es.curso.java.weather.entity;

import java.util.ArrayList;

public class ResultadoCiudades {
	
	private int totalResultsCount;
	private ArrayList<Geoname> geonames;
	
	public ResultadoCiudades(int totalResultsCount, ArrayList<Geoname> geonames) {
		super();
		this.totalResultsCount = totalResultsCount;
		this.geonames = geonames;
	}

	public int getTotalResultsCount() {
		return totalResultsCount;
	}

	public void setTotalResultsCount(int totalResultsCount) {
		this.totalResultsCount = totalResultsCount;
	}

	public ArrayList<Geoname> getGeonames() {
		return geonames;
	}

	public void setGeonames(ArrayList<Geoname> geonames) {
		this.geonames = geonames;
	}
	
	
 
}
