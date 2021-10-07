package version1;

import java.util.*;
import java.lang.Math;



public class voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voters voters;

        ArrayList<Voters> votersArrayList=new ArrayList<>();

        int ans;
        do {
        	System.out.println(" ");
        	  System.out.println("############# WELCOME TO VOTING APP ############## ");
        System.out.println("1- Register to vote: ");
        System.out.println("2- check if you are registerd: ");
        System.out.println("3- Quit");
        System.out.println("---------------------#########---------------------------");
        System.out.println("Enter your choice:");
        
        Scanner scanner= new Scanner(System.in);
        ans=scanner.nextInt();



        if (ans == 1) {
            ArrayList<Voters> returningList = addVoter(scanner, votersArrayList);
            
            
            if (returningList != null) {
                votersArrayList = returningList;
            }

        } else if (ans == 2) {
        	
            System.out.println("************Search Using your ID or reference No ************");
        	System.out.println("Enter your details:");
//            printVoter(votersArrayList);
            int voterId = scanner.nextInt();
            Voters searched = findVoter(voterId, votersArrayList);
            if (searched == null)
                System.out.println("............No details Found............");
            else {

//                System.out.println(searched.getvotersName());
                
                    printVoter(votersArrayList);
            }



        }


    }while (ans!=3);
            System.out.println("Exit..");
 }

        public static   ArrayList<Voters> addVoter(Scanner scanner, ArrayList<Voters> votersArrayList) {

            if (votersArrayList.size()<1) {

            	System.out.println("----------You must be 18 or older to Register--------------");
            	 System.out.println("Enter Age :");
                int votersAge = scanner.nextInt();

                
                
                
                if(votersAge>=18){

                    System.out.println("Please Enter Your Details Below : ");
                    System.out.println("********************************** ");
                    System.out.println("Enter Your name:");
                    String votersName = scanner.next();
                    System.out.println("Enter Your Surname:");
                    String votersSurname = scanner.next();
                    System.out.println("Enter Your Id:");
                    int votersId = scanner.nextInt();
                    scanner.nextLine();
                    
                    
                    
                    int min = 101010;
                    int max = 999999;
                    int votersref = (int)(Math.random()*(max-min+1)+min);

                              
                    votersArrayList.add(new Voters(votersName,votersSurname,votersId,votersAge,votersref));
                    System.out.println(" Hello " + votersName+" you are now registerd to vote and your details are as follow.");
                    
                    System.out.println("Full names: "+votersName.toString() + " " + votersSurname.toString());
                    System.out.println("ID No: "+votersId);
                    System.out.println("Age: "+votersAge);
                    System.out.println("Reference No: "+ votersref);
                    System.out.println(" ");
                    System.out.println("Keep your reference no safe " + votersref);
                    

     			
     		}else{
     			int age = (18 - votersAge);
     			System.out.println("Sorry, you cannot register to vote now! Please come back after: "+ age + " years");
     			System.out.println(" ");
     		}
                
                

              

            }
            else System.out.println("You have already registerd try seaching your id no or reference no!");

            return votersArrayList;
        }

        public static Voters findVoter(int code, ArrayList<Voters> votersArrayList){

            for (Voters voter:votersArrayList){
                if (voter.getvotersId()== code || voter.getvotersRef()== code)
//                	voter.printVoterInfo();
                    return voter;

            }
                return null;

        }
        
        
        public static void printVoter(ArrayList<Voters> voterssArrayList){
            for (Voters voters:voterssArrayList){
                voters.printVoterInfo();
            }

        }
        
  

}
