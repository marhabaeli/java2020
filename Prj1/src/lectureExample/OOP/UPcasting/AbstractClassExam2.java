package lectureExample.OOP.UPcasting;

abstract class Bike{  
    Bike(){
    	System.out.println("bike is created");
    }  
    
    abstract void run();  //abstract method
    
    void changeGear(){System.out.println("gear changed");}  //non-abstract method
}

class Honda extends Bike{  
    void run(){System.out.println("running safely..");}  
} 


class TestAbstraction2{  
     public static void main(String args[]){  
    	 
    	 Bike obj = new Honda();  
    	 obj.run();  
    	 obj.changeGear();  
     }  
}  

