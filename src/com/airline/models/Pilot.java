package com.airline.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pilot
 *
 */
@Entity

public class Pilot implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Pilot() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private Integer pilotLicence;
	
	@Enumerated(EnumType.STRING)
	private PilotRank pilotRank;
	
	@ManyToOne
	@JoinColumn(name = "flight_fk")
	private Flight flightForPilot;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getPilotLicence() {
		return pilotLicence;
	}

	public void setPilotLicence(Integer pilotLicence) {
		this.pilotLicence = pilotLicence;
	}

	public PilotRank getPilotRank() {
		return pilotRank;
	}

	public void setPilotRank(PilotRank pilotRank) {
		this.pilotRank = pilotRank;
	}

	public Flight getFlightForPilot() {
		return flightForPilot;
	}

	public void setFlightForPilot(Flight flightForPilot) {
		this.flightForPilot = flightForPilot;
	}

	@Override
	public String toString() {
		return "Pilot [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", pilotLicence="
				+ pilotLicence + ", pilotRank=" + pilotRank + ", flightForPilot=" + flightForPilot + "]";
	}
	
	
	
	
	
   
}
