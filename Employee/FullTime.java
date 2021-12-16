package Employee;
import java.util.Scanner;
public class FullTime {
private int hour;
private int rate=10;
private String name;


public void setName()
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your name  : ");
	this.name= scanner.nextLine();
}
public String getName()
{
	return this.name;
}
public FullTime() {
	this.rate=10;
}
public FullTime(int hour) {

	this.hour = hour;
	
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	this.hour = hour;
}
public int getRate() {
	return rate;
}
public void setRate(int rate,String pass) {
	if(pass=="admin") {
	
		this.rate = rate;
	}
	else
	{
		System.out.println("you are not an admin >");
	}
}





}
