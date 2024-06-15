package corejava;


class  ForExample{
	// int data[]=new int[10];  1.array initialization
	int data[]= {12,13,14,15,77}; //2.array initialization
	// int data[]=new int[]{12,13,14}; 3. array initialization
	/*void displayFor() {
		for( i=0;i<10;i++) {
			
			System.out.println("i="+i);  // simple method to display
		}
	}*/
	
	void displayFor() {
		for(int i=0;i<data.length;i++) {
			
			System.out.println("data["+i+"]="+data[i]);  //array
		}
	
}
}
public class MainFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ForExample fe=new ForExample();
      fe.displayFor();
	}

}
