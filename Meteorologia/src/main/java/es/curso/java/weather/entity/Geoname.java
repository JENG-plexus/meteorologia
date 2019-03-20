package es.curso.java.weather.entity;


public class Geoname {
	private Bbox bbox;
	private String asciiName;
	
	
	
	
	public Geoname(Bbox bbox, String asciiName) {
		super();
		this.bbox = bbox;
		this.asciiName = asciiName;
	}
	
	
	public Bbox getBbox() {
		return bbox;
	}
	public void setBbox(Bbox bbox) {
		this.bbox = bbox;
	}
	public String getAsciiName() {
		return asciiName;
	}
	public void setAsciiName(String asciiName) {
		this.asciiName = asciiName;
	}

	
	
}
