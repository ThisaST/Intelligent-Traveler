package edu.uok.se.itraveler.model;

public class Bus {

	private String busRegistrationNumber;
	private String busOwner;
	private String startingLocation;
	private String destination;
	
	
	public String getBusRegistrationNumber() {
		return busRegistrationNumber;
	}
	
	public void setBusRegistrationNumber(String busRegistrationNumber) {
		this.busRegistrationNumber = busRegistrationNumber;
	}
	
	public String getBusOwner() {
		return busOwner;
	}
	
	public void setBusOwner(String busOwner) {
		this.busOwner = busOwner;
	}
	
	public String getStartingLocation() {
		return startingLocation;
	}
	
	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
