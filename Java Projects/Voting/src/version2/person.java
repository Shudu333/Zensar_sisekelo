package version2;

public class person {
    private String fullname;
    private int age;
    private int id_number;
    private String address;

    public person(String fullname, int age, int id_number, String address) {
        // TODO Auto-generated constructor stub
         this.fullname = fullname;
         this.age = age;
         this.id_number = id_number;
         this.address = address;


    }
    public String getFullname(){ 
        return this.fullname;
    }

    public void setFullname(String fullname){ 
        this.fullname=fullname;
    }

    public  int getAge(){
        return this.age;
    }
    public void setAge(int age){ 
        this.age=age;
    }

    public  int getIdNumber(){ 
        return this.id_number;
    }
    public void setIdNumber(int id_number){ 
        this.id_number=id_number;
    }

    public String getAddress(){ 
        return this.address;
    }

    public void setAddress(String address){ 
        this.address=address;
    }
    public void Loin() {

    }
    public  void displayPerson(){
           System.out.println("FullNames : "+ getFullname());
           System.out.println("Age       : "+ getAge());
           System.out.println("Id Number : "+ getIdNumber());
           System.out.println("Address   : "+ getAddress());
           System.out.println("========================== \t");
       }
}