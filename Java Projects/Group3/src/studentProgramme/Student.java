package studentProgramme;

import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your Name and Surname");
		String inputName = name.nextLine();
		
		//Math weight Calculation
		
		Scanner MathExam = new Scanner(System.in);
		System.out.println("Enter your Exam Maths Mark");
		int inputMathExam = MathExam.nextInt();
		int weightMathExam = (inputMathExam * 70) / 100;
        Scanner MathTestMark = new Scanner(System.in);
		System.out.println("Enter your Test Maths Mark");
		int inputMathTest = MathTestMark.nextInt();
		int weightMathTest = (inputMathTest * 30) / 100;
		int MathRes = weightMathTest + weightMathExam;
		
		
		//Science weight Calculation
		
		Scanner SciExam = new Scanner(System.in);
		System.out.println("Enter your Exam Science Mark");
		int inputSciExam = SciExam.nextInt();
		int weightSciExam = (inputSciExam * 70) / 100;
		
		Scanner SciTest = new Scanner(System.in);
		System.out.println("Enter your Test Science Mark");
		int inputSciTest = SciTest.nextInt();
		int weightSciTest = (inputSciTest * 30) / 100;
		
		int SciRes = weightSciExam + weightSciTest;
		
		System.out.println("Student Name: " + inputName );
		System.out.println("");
		System.out.println("Field of study: BSC in Electrical engineering");
		System.out.println("Subject 1: Mathematics");
		System.out.println("Subject 2: Engineering Science");
		System.out.println("");
		System.out.println("School Fees Balance: R5 000");
		System.out.println("School Fees Paid: R20 000");
		System.out.println("");
		System.out.println("Levy 1: Electricity per month: R300");
		System.out.println("Levy 2: Water per month: R200");
		System.out.println("");
		
		//Calcualting the GPA
		System.out.println("your Maths semester Mark is : " + MathRes);
		System.out.println("Your Science semester Mark is : "+ SciRes);
		System.out.println("");
		
		int GPA = (SciRes + MathRes) / 2;
		System.out.println("This is your GPA score " + GPA);
		
		if (GPA < 50) {
			System.out.println("We regret to inform that You Failed:-(");
		}
		else {
			System.out.println("****PAssed****");
		}

	}

}