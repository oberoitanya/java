package lab_file;


class TestFinally{
	int a,b ;
	TestFinally(int a,int b){
		this.a=a;
		this.b=b;
		}
	void divideby() {
		try {
		float result;
			result =a/b;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("in finally bloack");
		}
	}
}
public class FinallyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestFinally tf=new TestFinally(5,0);
      tf.divideby();
	}

}
