package lab_file;

class InvalidInputException extends Exception{
	 String msg;
	 InvalidInputException(String msg)
	 {
	 this.msg=msg;
	 }
	public String toString()
	 {
	 return msg;
	 }
	}
	class Customer
	{
		private String custNo;
		private String custName;
		private String category;

		public void setCategory(String category) {
			this.category = category;
		}
		
		public void setCustName(String custName) {
			this.custName = custName;
		}
		
		public void setCustNo(String custNo) {
			this.custNo = custNo;
		}
		public void customerNo()
		{
			try
			{
			   if(custNo.startsWith("c")||custNo.startsWith("C"))
			   {
			      System.out.println(custNo);
			   }
			   else
			   {
			      throw new InvalidInputException("customer no is not valid");
			   }
			}
			catch(InvalidInputException e)
			 {
			 System.out.println(e.toString());
			 } 
	}
		public void customerName()
		{
			try
			{
			   if(custName.length()>=4)
			   {
			      System.out.println("Customer Name="+custName);
			   }
			   else
			   {
			      throw new InvalidInputException("customer Name is not valid");
			   }
			}
			catch(InvalidInputException e)
			 {
			 System.out.println(e.toString());
			 } 
	}
		public void customerCategory()
		{
			try
			{
			   if(category.equals("Platinum")||category.equals("Gold")||category.equals("Silver"))
			   {
			      System.out.println("Customer catogory="+category);
			   }
			   else
			   {
			      throw new InvalidInputException("customer Caetgory is not valid");
			   }
			}
			catch(InvalidInputException e)
			 {
			 System.out.println(e.toString());
			 } 
	}
	}


public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer();
		obj.setCustNo("c0001");
		obj.customerNo();
		obj.setCustName("ABCD" + "");
		obj.customerName();
		obj.setCategory("Silver");
		
		obj.customerCategory();
	}

}
