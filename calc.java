package corejava;

class Sub{
	int n1,n2;
	
	Sub(int n1,int n2){
		
		this.n1=n1;
		this.n2=n2;
	}
	
	void getSub() {
		
		int c=n1-n2;
		System.out.println("Sub="+c);
	}
}
class Mul{
	int num1,num2;
	
	Mul(int num1,int num2){
		
		this.num1=num1;
		this.num2=num2;
	}
	
	void getMul() {
		
		int m=num1*num2;
		System.out.println("Mul="+m);
	}
}



class Sum{
	int num1=10, num2=20;
	
	Sum(int num1,int num2)
	  {
		
		this.num1 =num1;
		this.num2 =num2;
	  }
	
	void getSum()
	{
		int s=num1+num2;
	 System.out.println("Sum="+s);
	}
}
public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sum s1 = new Sum(10,5);
        s1.getSum();
        
        Mul m1 = new Mul(10,5);
        m1.getMul();
        
        Sub c1=new Sub(7,4);
        c1.getSub();
	}

}
