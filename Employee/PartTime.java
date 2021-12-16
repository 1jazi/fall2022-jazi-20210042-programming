package Employee;

public class PartTime {
private int hour;
private int rate;
private String name;
public PartTime(String name) {
	
	this.name = "jazi";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PartTime() {
	this.rate=5;
}
public PartTime(int hour, int rate) {
	
	this.hour = hour;
	this.rate = rate;
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
public void setRate(int rate) {
	this.rate = rate;
}


}
