# Java_EE_Udemy31
One To Many Relationship Annotations (flights and its pilots)

One to Many between Pilot and Flight:
Pilot: 

      @ManyToOne
	    @JoinColumn(name = "flight_fk")
	    private Flight flightForPilot;
      
Flight:

      @OneToMany(mappedBy = "flightForPilot")
	    private List<Pilot> pilots;
