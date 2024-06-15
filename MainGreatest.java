
package lab_file;

import java.util.Scanner; 

class GreatestNumber{
	
	int num1 ,num2,num3;
	
	void getnumber() {
        Scanner n = new Scanner(System.in);	
        System.out.println("Enter number1=");
        num1=n.nextInt();
         System.out.println("Enter number2=");
        num2=n.nextInt();
         System.out.println("Enter number3=");
        num3=n.nextInt();
        
        if(num1>num2&&num1>num3)
        {
        System.out.println("greatest ="+num1);
        }
       else if(num2>num1&&num2>num3)
        {
        System.out.println("greatest ="+num2);
	    }
       else if(num3> num1 && num3>num2)
       {
    	   System.out.println("greatest ="+num3); 
       }
        
       else {
    	   System.out.println("all are equal. "); 
       }
}
}

public class MainGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		GreatestNumber gt=new GreatestNumber();
		gt.getnumber();
	}

}
