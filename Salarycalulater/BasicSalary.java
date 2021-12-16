package Salarycalulater;

public class BasicSalary {

	public int CalcualateSalary(int hour,int rate )
	{
		int salary = hour * rate;
		return salary;
		
	}
	public int CalculateSalary(int hour,int rate,boolean overTime,int overTimeCount)
	{
		int salary = CalcualateSalary(hour,rate);
	    if(overTime== true) 
	    {
	    	salary =  OverTimeSalary.CalculateOverTimreSalary(salary, overTimeCount);
	    }
		return salary;
	}
	
	
}
