package thread;
 class OddThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i+=2)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

 class EvenThread implements Runnable
 {
 	public void run()
 	{
 		for(int i=0;i<=10;i+=2)
 		{
 			System.out.println(i);
 			
 			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		}
 	}
 }

public class ThreadMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddThread th1=new OddThread();
		
		
		EvenThread th2=new EvenThread();
		Thread th=new Thread(th2);
		
		th1.setName("OddnumberThread");
		th.setName("EvennumberThread");
		
		System.out.println(th1.getName());
		System.out.println(th.getName());
		
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.start();

	}

}
