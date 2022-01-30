package paradigms;

public class Main {
	public static void main(String[] args) {
         
		// make an object for super class and give it a value for constructor
		Atm obj1= new Atm("Jordan");
		// call getters and setters 
		obj1.setUserName(obj1.getUserName()); // jazi
		obj1.setPassword(obj1.getPassword()); // 1234
	
		Atm2 obj2 = new Atm2();
      
    	   
		if (obj1.getUserName().equals("jazi")&&obj1.getPassword().equals("1234")) {
			obj1.bank();
			obj2.bank();
		
		}
	 
		else {
           
			System.out.println("error , try again !!!!\n");
			//make objects and give it value for constructor 
			Atm3 obj3 = new Atm3("\n\nAmman,Irbid,Aqaba");
			Atm3 obj4 = new Atm3(10,4);
			
		}
		
       }
	}


