package lab_file;

interface A{
	
	void display();
}

interface B{
	
	void show();
}

class S implements A,B{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("triangle is shown");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("circle is display");
	}
	
}
public class Multipleinherit {
    
	public static void main(String[] args) {
		 S s1=new S();
		s1.show();
		s1.display();
	}
	
}
