package studentProgramme;
import java.util.*;

public class StudentProgram {

	
	public static void main(String[] args) {
		
		/********************* Using Java Random Class ***************************************/
		        	Random objGenerator = new Random();
		            for (int iCount = 0; iCount< 6; iCount++){
		              int randomNumber = objGenerator.nextInt(46);
		              System.out.println("Random No : " + randomNumber); 
		              
		              
		   
		             }
		            
		            
		/********************* Using Java Math.Random ***************************************/
		            for(int xCount = 1; xCount<= 6; xCount++){
		            	int Random = (int)(Math.random()*46);
		                System.out.println(Random);
		              }
		     
		            
		            
		            
		            int size = 36;

		            ArrayList<Integer> list = new ArrayList<Integer>(size);
		            for(int i = 1; i <= 6; i++) {
		                list.add(i);
		            }

		            Random rand = new Random();
		            while(list.size() > 0) {
		                int index = rand.nextInt(list.size());
		                System.out.println("Selected: "+list.remove(index));
		            }
	}
}
