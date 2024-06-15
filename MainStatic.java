package lab_file;

public class MainStatic {
	
	static int i=10;
	static
	 {
	 m1();
	 System.out.println("first static block " +i);
	 } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		 System.out.println("Main method"); 
	}

	public static void m1()
	 {
	 System.out.println(j);
	 }
	static
	 {
	 System.out.println("second static block");
	 }
	static int j=20;
	 }


