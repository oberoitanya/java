package inheritance;

class A{                 //super class
	String name="";
	void display() {
     System.out.println("this is class A ");
}
}

class B extends A{               // sub class
   int value=10;
   void print() {
	   System.out.println("this is class B");
   }
}

public class MainInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A a1 = new A();
        a1.display();
        
        B b1 = new B();
        b1.display();
        
        B b2 = new B();
        b2.name="class B";
       System.out.println("... "+b1.name);
       
       b1.display();
       
       System.out.println(" vlaue = "+b1.value);
	}
	}


