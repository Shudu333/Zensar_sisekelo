package oop;

public class Employee {
	
	String Employee_Name;
	int Employee_Number;
	String Position;
	double Salary;
	String Departement;
	//Constructor for the employee
	Employee(String employee,int employee_id,String position,double salary,String department)
	{
		this.Employee_Name = employee;
		this.Employee_Number = employee_id;
		this.Position = position;
		this.Salary = salary;
		this.Departement = department;
	}

}
