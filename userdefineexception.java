package lab_file;

class AgeCheckException extends Exception{
    String error;
    AgeCheckException(String error){
    	this.error=error;
    }
	@Override
	public String toString() {
		return "AgeCheckException [error=" + error + "]";
	}
	
    
}
    
    class Vote{
    	int age;
    	Vote(int age){
    		this.age=age;
    	}
    	
    	void doVote() throws AgeCheckException {
    		if (age>18) {
    			System.out.println("you can vote.");
    		}
    		else {
    			throw new AgeCheckException("your age is less than 18.");
    			}
    }
    }
   
public class userdefineexception {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Vote v = new Vote(12);
         try {
			v.doVote();
		} catch (AgeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


