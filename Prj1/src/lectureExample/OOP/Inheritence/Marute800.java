package lectureExample.OOP.Inheritence;

public class Marute800 extends Maruti{
		int maxspeed=180;
	   public Marute800()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {System.out.println("my parent speed is"+super.maxspeed);
//		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		 Marute800 obj=new Marute800();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
		 System.out.println("my speed is"+obj.maxspeed);
		
	   }
	}


class Car{
	   public Car()
	   {
		System.out.println("Class Car");
	   }
	   
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}

class Maruti extends Car{
	
	   int maxspeed=120;
	   public Maruti()
	   {super();
		System.out.println("Class Maruti");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
