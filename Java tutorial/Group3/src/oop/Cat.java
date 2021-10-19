package oop;

public class Cat extends Animals {
	
	 @Override
	    public void sound(){
	        System.out.println("Meow");
	    }
	    public static void main(String args[]){
	    	Animals obj = new Cat();
	    	obj.sound();
	    }

}
