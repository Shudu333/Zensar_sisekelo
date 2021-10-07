package version2;

/* Mashudu 
Patricia
Judith
mamosa */

import java.util.*;
public  class voter extends person {
     int voting_number;

    public voter(String fullname, int age,int id_number,String address, int voting_number) {
        // TODO Auto-generated constructor stub
        super(fullname,age,id_number,address);
        this.voting_number = voting_number;
    }

    public int getVotingNumber(){ 
        return this.voting_number;
    }

    public void setVotingNumber(int  votin_number){ 
        this.voting_number=votin_number;
    }

    @Override 
    public void displayPerson() {
        System.out.println("voting_number : "+ getIdNumber() + getAge() );
        super.displayPerson();

    }


    public static void main(String[] args) {

        ArrayList<voter> voters = new ArrayList<voter>();
        voter voter;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        int voting_number ;

        if(age < 18) {
            System.out.println("Opps!, you dont qualify to vote ");
        }else {
            System.out.println(" Welcome, Your vote counts \n *********************************************** \n Select your desired option \n =============================");
            while(true) {
            System.out.println(" Enter 1 to reister for voting \n Enter 2 to Check if Your Registered \n Enter 3 to View all registered voters \n Enter 4 to Exit");
            int options = input.nextInt();

            switch (options) {
            case 1: {
                System.out.println("Please Enter Your Details Below : ");
                System.out.println("********************************** ");

                System.out.println( "Enter FullNames :");
                String fullname  = input.next();

                System.out.println(  "Enter ID Number :");
                int id_number = input.nextInt();

                System.out.println(  "Enter Address: ");
                String address = input.next();
                voting_number = id_number +age ;
                 voter=new voter(fullname, age, id_number, address ,voting_number);
                voters.add(voter);
 
                System.out.println(  "Thank you for Registering \n here is your reference number: "+ voter.voting_number);
                break; 

            }
            case 2: {
                System.out.println("Enter Id Number to Search : ");
                int id_number = input.nextInt();
                for(int i = 0; i < voters.size(); i ++) {
                    voter = voters.get(i);
                    if (id_number == voter.getIdNumber()) {
                        System.out.println("Here are your Details: ");
                        System.out.println("************************ ");
                        voter.displayPerson();

                    }else
                    {
                        System.out.println("Opps, Seems like you are not reistered \n Please register first \n");
                    }

                }
                break;

            }
            case 3:{
                System.out.println("All registered Voters ");
                System.out.println("********************** ");

                    if(voters.size() <= 0) {
                        System.out.println(" No Registered voters ");

                    }else 
                    {
                        for(int x = 0; x < voters.size(); x++) {
                        voters.get(x).displayPerson();

                    }

                }
                break;

            }
            case 4:{
 
                System.out.println(" Thank you for using our system ");
                System.exit(0);
            }
            default:
                System.out.println( "Oh no, Something went wrong,  Enter option 1 to 4");
            }

        }
    }
    }
 
}