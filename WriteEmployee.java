package lab_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Employee{
	
	private String empName;
	private int empNo,empBasic;
	
	Employee(String empName,int empNo,int empBasic){
		this.empName=empName;
		this.empNo=empNo;
		this.empBasic=empBasic;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpBasic() {
		return empBasic;
	}
	public int getEmpNo() {
		return empNo;
	}
		
	
}

public class WriteEmployee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n =new Scanner(System.in);
		System.out.println("Enter Name:");
		String empName=n.nextLine();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number:");
		int empNo=sc.nextInt();
		
		System.out.println("Enter basic:");
		int empBasic=sc.nextInt();
		 
		Employee emp1 =new Employee(empName,empNo,empBasic);
		
		 File f = new File ("My.txt");
		 
		 FileWriter fw;
		try {
			fw = new FileWriter(f,true);
			fw.write("Employee name "+ emp1.getEmpName());
			fw.write("Employee number "+ emp1.getEmpNo());
			fw.write("Employee basic "+ emp1.getEmpBasic());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		}
	

}

