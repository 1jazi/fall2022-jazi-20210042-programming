package paradigms;
import java.util.Scanner;
import java.time.*;
public class Procedural {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("hi plz enter your name : ");
	String name = scanner.nextLine();  // add scanner to get name
	System.out.println("enter you salary :");
	double salary = scanner.nextDouble();
	int main = 0;
	while(main!=4)  //central control loop for the menu and if you choose 3 it will exit
	{
		System.out.println("********************************************************");//print the menu
		System.out.println("\n\n"+"welcome "+name+" choose a number from the menu : ");
		System.out.println("1-calculate your monthly Expenses");
		System.out.println("2-Expenses of your family member");
		System.out.println("3-see the date and time now");
		System.out.println("4-Exit");
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
			double sum;
			System.out.println("your monthly expenses > " +monthlyExpenses(water,electrecity,food,fuel, others));
			sum = monthlyExpenses(water,electrecity,food,fuel, others);
		    sum = salary - sum;
		    System.out.println(" you will save >"+sum);
		    
		}
	
		else if(main==2)
		{
		
			family();  // call the function
	    }
		else if(main==3) //if user enter 3 the program will exit
		{
			Time();
		}
		else if(main==4) //if user enter 3 the program will exit
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
public static void  family()
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter how many members in your family ");
	int member=scanner.nextInt();
	System.out.println("enter the age ");
	int age = scanner.nextInt();
	if(age<5) {
		System.out.println("you need 5 jd");
	}
	else if(age>5&&age<10) {
		System.out.println("you need 10 jd");
	}
	else if(age>10&&age<20) {
		System.out.println("you need 30 jd");
	}
	else if(age>20&&age<30) {
		System.out.println("you need 40 jd");
	}
	
}

}
