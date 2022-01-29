package ProgrammingParadaigms;
import java.util.Scanner;
import java.time.*;
public class Procedural {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("hi plz enter your name : ");
	String name = scanner.nextLine();  // add scanner to get name
	
	int main = 0;
	while(main!=3)  //central control loop for the menu and if you choose 3 it will exit
	{
		System.out.println("********************************************************");//print the menu
		System.out.println("\n\n"+"welcome "+name+" choose a number from the menu : ");
		System.out.println("1-calculate your monthlyExpenses");
		System.out.println("2-see the date and tome now");
		System.out.println("3-Exit");
		 main=scanner.nextInt(); // get the main from user
		if(main==1)
		{
			System.out.println("enter your budget for water");
			int water=scanner.nextInt();
			System.out.println("enter your budget for electrecity");
			int electrecity =scanner.nextInt();
			System.out.println("enter your budget for food");
			int food=scanner.nextInt();
			System.out.println("enter your budget for fuel");
			int fuel=scanner.nextInt();
			System.out.println("enter your budget for others");
			int others=scanner.nextInt();
			// call the function
			System.out.println("your monthly expenses > " +monthlyExpenses(water,electrecity,food,fuel, others));
		
		}
	
		else if(main==2)
		{
		
			Time();  // call the function
	    }
		else if(main==3) //if user enter 3 the program will exit
		{
			System.out.println("Exit");
		}
		else
		{
		System.out.println("invalid choice");
		}

}
	
}
//function to calculate monthly expenses
public static int monthlyExpenses(int water, int electrecity, int food, int fuel, int others)
 {
	
	return water+electrecity+food+fuel+others;
 }
//function to get time and use time library
public static void Time()
 {
	System.out.println("the time is : "+LocalTime.now());
	System.out.println("the date is : "+LocalDate.now());
 }

}
