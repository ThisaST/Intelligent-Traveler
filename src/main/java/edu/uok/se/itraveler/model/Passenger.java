package edu.uok.se.itraveler.model;

import java.util.List;

public class Passenger {

	private String passengerId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String contactNumber;
	private String nicNumber;
	private String password;
	private String username;
	
	private List<Location> locations;
	
	private List<Speed> speeds;
	
	private List<JourneyTime> journeyTimes;
 	
	
	public String getPassengerId() {
		return passengerId;
	}
	
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getNicNumber() {
		return nicNumber;
	}
	
	public void setNicNumber(String nicNumber) {
		this.nicNumber = nicNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public List<Speed> getSpeeds() {
		return speeds;
	}

	public void setSpeeds(List<Speed> speeds) {
		this.speeds = speeds;
	}

	public List<JourneyTime> getJourneyTimes() {
		return journeyTimes;
	}

	public void setJourneyTimes(List<JourneyTime> journeyTimes) {
		this.journeyTimes = journeyTimes;
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + ", contactNumber=" + contactNumber + ", nicNumber=" + nicNumber
				+ ", password=" + password + ", username=" + username + "]";
	}
	
	
}
