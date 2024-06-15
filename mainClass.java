package corejava;

class GreaterNumber{
	
	int num1,num2;         //instance variables
	
	GreaterNumber(int n1,int n2){     //constructor mai krna initialize
		num1=n1;                   //more than 1 constructor is called 
		                          // constructor overloading.
		num2=n2;
	}
	
	GreaterNumber(){
		num1=9;
		num2=10;
	}
	public void cheakGreater() {
		if(num1>num2) {
			System.out.println("num1 is greater.");
		}
		else {
			System.out.println("num2 is greater.");
		}
	}
	
	/*void cheakGreater(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3) {   // local variable direct 
			System.out.println("num1 is greater."); 
		}
		
		else if(num2>num1 && num2>num3) {
			System.out.println("num2 is greater.");
		}
		
		else {
			System.out.println("num3 is greater.");
		}
	}*/
}

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	GreaterNumber gn= new GreaterNumber();
		//gn.num1=30;  object mai initialize krna
		//gn.num2=12;
		//gn.cheakGreater(23,45,89);
		
	GreaterNumber gn1=new GreaterNumber();
		gn1.cheakGreater();

	}

}
