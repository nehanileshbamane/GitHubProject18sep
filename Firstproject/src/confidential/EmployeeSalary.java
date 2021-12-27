package confidential;

import java.util.Scanner;

public class EmployeeSalary
{
  private int Salary=100000;
  
  public int getSalary()
  {
	  Scanner Security=new Scanner(System.in);
	  String Password;
	  System.out.println("Enter Password:");
	  Password=Security.nextLine();
	  if(Password.equals("neha@123"))
	return Salary;  
	  return (Interger) null;
	  
  }
}
