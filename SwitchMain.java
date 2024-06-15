package corejava;

class DayOfWeek 
{
	void cheakWeek ( int  value) {     // basic switch case
		
		switch(value) {
		case 1:System.out.println("SUNDAY");break;
		case 2:System.out.println("MONDAY");break;
		case 3:System.out.println("TUESDAY");break;
		case 4:System.out.println("WEDNESDAY");break;
		case 5:System.out.println("THURSDAY");break;
		case 6:System.out.println("FRIDAY");break;
		case 7:System.out.println("SATURDAY");break;
		default:System.out.println("NOT A DAY");
		}
		
	}
	
	
void cheakDay(int value) {     //  switch expression
		String day = "" ;
		
		day=switch(value)
		{
		
		case 1->"SUNDAY";
		case 2->"MONDAY";
		case 3->"TUESDAY";
		case 4->"WEDNESDAY";
		case 5->"THURSDAY";
		case 6->"FRIDAY";
		case 7->"SATURDAY";
		default->"NOT A DAY";
		
		
		};
		
		System.out.println(""+day);
	
}
}
public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		DayOfWeek dw= new DayOfWeek();
		dw.cheakDay(6);
		
		DayOfWeek dw1= new DayOfWeek();
		dw1.cheakWeek(1);
	}

}
