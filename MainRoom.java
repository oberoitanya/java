package lab_file;
import java.util.Scanner;

class Room{
	int roomno;
	String roomtype="";
	String roomarea="";
	String ACmachine="";
	void setData() {
	
	Scanner n = new Scanner(System.in);
	Scanner sc= new Scanner(System.in);
	System.out.println("enter room no:");
	roomno=n.nextInt();
	System.out.println("enter room type = ");
	roomtype=sc.nextLine();
	System.out.println("enter room area = ");
	roomarea= sc.nextLine();
	System.out.println("enter ac machine = ");
	ACmachine=sc.nextLine();
}
	
	void display() {
		System.out.println("room no = "+roomno);
		System.out.println("room area = "+roomarea);
		System.out.println("room type = "+roomtype);
		System.out.println("room ac machine = "+ACmachine);
		
	}
}
public class MainRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room r1 =new Room();
		r1.setData();
		r1.display();

	}

}
