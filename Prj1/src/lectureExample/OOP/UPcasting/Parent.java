package lectureExample.OOP.UPcasting;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Parent {
	int x=10;
    void show(){
      System.out.println("parent-show"); }   
void OnlyParentShow(){    
  System.out.println("OnlyParentShow");}

}

class Child extends Parent{
    int x=20;  //c.x
    
    @Override
    void show(){  //c.show
        System.out.println("child-show");
    }  //c.OnlyParentShow()
    void OnlyChildShow(){  //c.OnlyChildShow
        System.out.println("OnlyChildShow");
    }
}

class ParentChild {
	 
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();//
        p.OnlyParentShow();
        
        System.out.println(p.x);
        System.out.println(new Child().x);
        
    }
}

