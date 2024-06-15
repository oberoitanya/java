package lab_file;

class ThrowsEx{
	void checkage(int age) throws ArithmeticException{
		if (age<18) {
			throw new ArithmeticException("Acess must be 18");
		}
		else {
			System.out.println("acess granted");
		}
	}
}
public class throwMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsEx t=new ThrowsEx();
		t.checkage(15);

	}

}
