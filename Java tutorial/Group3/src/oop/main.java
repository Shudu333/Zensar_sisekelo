package oop;

import java.util.*;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);		
		
        System.out.println("Enter employee name");
        String name = obj.nextLine();
        
        Employee emp = new Employee(name,2548,"Tester",10000,"IT"); 
        
        System.out.println("");
        System.out.println("Employee details below : \n" + " Employee name: " + emp.Employee_Name + " \nEmployee number  :"+ emp.Employee_Number+ " \n Occupation : " + emp.Position +"\n Salary : R "+ emp.Salary + " \n Department : " + emp.Departement);
	}

}
