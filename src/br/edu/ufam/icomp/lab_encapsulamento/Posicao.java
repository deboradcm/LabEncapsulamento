package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao{
	private double latitude;
	private double longitude;
	private double altitude;
	
	public Posicao(double novaLatitude, double novaLongitude, double novaAltitude) {
		this.setAltitude(novaAltitude);
		this.setLongitude(novaLongitude);
		this.setLatitude(novaLatitude);
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
		
	}
	
	public double getLongitude() {
		return longitude;
	}
	
    public void setAltitude(double altitude) {
    	this.altitude = altitude;
		
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
		
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public String toString() {
		return "Posição: " + this.getLatitude() +", "+ this.getLongitude()+", " + this.getAltitude() ;
		
	}


	
	
	

}
