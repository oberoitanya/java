package lab_file;


class Number{
	private double n;
	Number(int n){
		this.n=n;
		}
	public boolean isZero()
	{
		if(n==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPositive() {
		if(n>0) {
			return true;
		}
		
		else
		{
			return false;
		}
	}
		
		public boolean isNegative() {
			if(n<0) {
				return true;
			}
			
			else{
				return false;
			}
		}
		
		public boolean isOdd() {
			if(n%2!=0) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		public boolean isEven() {
			if(n%2==0) {
				
				return true;
				}
			
			else {
				return false;
			}
		}
		
		//System.out.println("number is: "+n);  
}

public class doublePrimiriveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number n1=new Number(4);
		n1.isZero();
		 n1.isEven();
		 n1.isNegative();
		 n1.isOdd();
		 n1.isPositive();
		 
	
		
	}

}
