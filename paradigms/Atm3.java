package paradigms;

public class Atm3 extends Atm {
	
	
	 double time1;
	 double time2;
	 
	// make a constructor and overload
	public Atm3(String location) {
		System.out.println(" locations for our bank : " + location);
		this.location = location;
	}
	public Atm3(double time1, double time2) {
		System.out.println(" we are available from  " + time1+" Am to "+time2+" pm");
		this.time1=time1;
		this.time2=time2;
	}

}
