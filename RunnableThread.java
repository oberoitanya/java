package corejava;

class Shared{
	int num=0;
	boolean value=false;
	synchronized int get() {
		if(value==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("InterruotException Caught");
			}
		}
		for(int i=1;i<5;i++) {
			System.out.println("Consumer="+i);
		}
	
			value=false;
			notify();
		return num;
	}
	
	

	synchronized int put(int num) {
		if(value==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("InterruotException Caught");
			}
		}
		  this.num=num;
		  
			value=true;
			notify();
			return num;
}
}

class Consumer extends Thread{
	Shared s;
	Consumer(Shared s){
		this.s=s;
		this.start();
	}
	
	public void run() {
		s.get();
		for(int i=1;i<5;i++) {
			System.out.println("Consumer="+i);
		  }
		
	}
}

class Producer extends Thread{
	Shared s;
	Producer(Shared s){
		this.s=s;
		this.start();
	}
	
	public void run() {
		int i=0;
		for(int j=1;j<5;j++) {
			System.out.println("producer="+j);
		  }
		s.put(++i);
	}
}
public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Shared s = new Shared();
         new Producer(s);
         new Consumer(s);
	}

}

