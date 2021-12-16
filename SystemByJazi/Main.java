package SystemByJazi;
import Employee.FullTime;
import Employee.PartTime;
import Salarycalulater.BasicSalary;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
	
	
   FullTime emp1 = new FullTime();	
   emp1.setName();
   String name = emp1.getName();
   System.out.println(" the name of employee is "+name);
   if(name.contains("a"))
   {
	   System.out.println("you got 20 jd bonus ");
	  
   }
   if(emp1.getName().startsWith("U"))
   {
	   System.out.println("you are unique");
   }
  
   emp1.setHour(8);    
   System.out.println("-the rate is : "+emp1.getRate()+"\n");
   
   emp1.setRate(10, "admin");  //get password from the user.
   BasicSalary emp1Salary = new BasicSalary();  
   int salary1 = emp1Salary.CalcualateSalary(emp1.getHour(),emp1.getRate());
   System.out.println("salary 1 = "+salary1);
   salary1 += 20;
   salary1 = emp1Salary.CalculateSalary(emp1.getHour(),emp1.getRate(),true,5);
   System.out.println("salary with over time = "+salary1);
   
   System.out.println("************************************************");
   
   PartTime emp2Salary = new PartTime();
   emp2Salary.setHour(4);
   BasicSalary emp2Salary2 = new BasicSalary();
   int Salary2 = emp2Salary2.CalcualateSalary(emp2Salary.getHour(),emp2Salary.getRate());
   System.out.println("Salary 2 = "+Salary2);
   
   Salary2 = emp2Salary2.CalculateSalary(5,emp2Salary.getRate(),true, 4); //from class basicSalary
   System.out.println("Salary with over time "+Salary2);
   int max=Math.max(salary1, Salary2);
   System.out.println("the hightest salary is : "+max+"\n");
   
   System.out.println("*************************************************");
   System.out.println(" this information was generated in : "+LocalDateTime.now());
   
   ArrayList<FullTime> FullTimeEmployee = new ArrayList<FullTime>();
   
   FullTimeEmployee.add(emp1);
   for(FullTime emp :  FullTimeEmployee)
   {
	   System.out.println("name of employee : "+emp.getName());
   }
}

}
