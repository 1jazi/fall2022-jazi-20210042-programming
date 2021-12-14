package practice;

public class mobile {


	private String brand;
	private String color;
	private int yearOfProduction;
	public mobile()
	{
		System.out.println("***welcome***"+"\n");
	}
	public void setbrand(String brand)
	{
		this.brand=brand;
		
	}
	public String getbrand()
	{
		return brand;
	}
	public void setColor(String color) 
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setYear(int yearOfProduction)
	{
		this.yearOfProduction=yearOfProduction;
	}
	public int getyear()
	{
		return yearOfProduction;
	}
	
	
}
