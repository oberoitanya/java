package lab_file;


public class Commandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int sum=0;
          String data="";
          if(args.length>0) {
        	  for(int i=0;i<args.length;i++) {
        		  data=args[i];
        		  sum=sum+Integer.parseInt(data);
        	  }
        	  System.out.println("sum="+sum);
          }
          
          else {
        	  System.out.println("invalid");
          }
	}

}
