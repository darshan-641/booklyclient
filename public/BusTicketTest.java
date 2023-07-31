public class BusTicketTest {
    public static void main(String[] args) {
        
    	LocalBus localBus = new LocalBus("Ramesh", "PMPL");
    	localBus.starts();
    	
    	Passenger passenger1 = new Passenger("Hinjewadi");    	
    	passenger1.booksTicket("Banner");
    	
    }
}



interface Vehicle{
	void starts();
    void drives();
    void stop();

}

abstract class Bus implements Vehicle{
    protected String drivername;
    protected int driverId;
    protected String BusName;
    
}

class LocalBus extends Bus{
	public static int driverCount=0;
	LocalBus(String driverName,String busName){
		this.drivername = driverName;
		this.BusName = BusName;
		this.driverId = driverCount++;
	}
	public void starts() {
		System.out.println("Bus has started to drove");
	}
    public void drives(){
        System.out.println("Driving from LocalBus");
    }
    
    public void stop() {
    	System.out.println("Bus has stopped....");
    }
	


   
}




class TicketMachine{
	
	
}

class Ticket{
    static private int ticketId;
    private String source;
    private String destination;
    private float ticketPrice;
    static private int ticketCount = 0;
    
    Ticket(String source, String destination){
    	this.ticketId = ticketCount++;
    	this.source = source;
    	this.destination = destination;
    }

	private static int getTicketId() {
		return ticketId;
	}

	private static void setTicketId(int ticketId) {
		Ticket.ticketId = ticketId;
	}

	private String getSource() {
		return source;
	}

	private void setSource(String source) {
		this.source = source;
	}

	private String getDestination() {
		return destination;
	}

	private void setDestination(String destination) {
		this.destination = destination;
	}

	private float getTicketPrice() {
		return ticketPrice;
	}

	private void setTicketPrice(float ticketPrice) {
		
		float value = (float) Math.random()%10 * 1000;
		this.ticketPrice = value;
	}
    
    
    
    
}

class TicketConductor{
//    private TicketMachine ticketMachine;
	Ticket ticket;
    private static int conductorId;
    private String destination;
    public TicketConductor(String destination) {
		// TODO Auto-generated constructor stub
    	this.destination = destination;
	}
    public Ticket bookTicket() {
    	Ticket ticket = new Ticket("Hinjewadi", "Banner");
    	return ticket;
    }
}



class Passenger{
    static private int  passengerCount=0;
    Ticket ticket;
    private int passengerId;
    private String source;
    private String destination;
    
    Passenger( String destination){
    	this.destination = destination;
    	this.passengerId = passengerCount++;
    }
    
    Ticket booksTicket(String source) {
    	
    	System.out.println("Passenger is Telling destination to conductor....");
    	
    	Ticket = new TicketConductor(this.destination);
    			
    	
    	
    	
    	return null;
    	
    }
    
}
