package studentProgramme;
import java.util.*;

public class students {
	
	public static void main(String[] args) {
	   
		
		Scanner nameObj = new Scanner(System.in);
	    System.out.println("Enter Student Name");
	    String studentName = nameObj.nextLine();
	    
	    Scanner surnameObj = new Scanner(System.in);
	    System.out.println("Enter Student Surname");
	    String studentSurname = surnameObj.nextLine();
	    
	    Scanner degreeObj = new Scanner(System.in);
	    System.out.println("Enter Degree Name");
	    String degreeName = degreeObj.nextLine(); 
	    
	    Scanner sub1Obj = new Scanner(System.in);
	    System.out.println("Enter First Subject Name");
	    String subject1 = sub1Obj.nextLine(); 
	    
	
	    System.out.println("Enter First Subject Test Mark");
	    int subject1Test = sub1Obj.nextInt();
	    
	   
	    System.out.println("Enter First Subject Assigment Mark");
	    int subject1Assigment = sub1Obj.nextInt();
	    
	    Scanner sub2Obj = new Scanner(System.in);
	    System.out.println("Enter First Subject Name");
	    String subject2 = sub1Obj.nextLine(); 
	    
	
	    System.out.println("Enter First Subject Test Mark");
	    int subject2Test = sub1Obj.nextInt();
	    
	   
	    System.out.println("Enter First Subject Assigment Mark");
	    int subject2Assigment = sub1Obj.nextInt();
	  
	    
	    int semesterMark = subject1Test + subject1Assigment;
	    
	    String leftAlignFormat = "| %-15s | %-4d |%n";

	    System.out.format("+-----------------+------+%n");
	    System.out.format("| Column name     | ID   |%n");
	    System.out.format("+-----------------+------+%n");
	    
	    System.out.println("Student Full Name: " + studentName +" " + studentSurname);
	    System.out.println("Degree Name: " + degreeName);
	    System.out.println("Subject 1: " + subject1 + " " + subject1Test + " "+ subject1Assigment);
	    System.out.println("Subject 2: " + subject2 + " " + subject2Test + " "+ subject1Assigment);
	    
	    
	   
	    for (int i = 0; i < 5; i++) {
	        System.out.format(leftAlignFormat, "some data" + i, i * i);
	    }
	    System.out.format("+-----------------+------+%n");
	  }
}
