class MyRunnableExample implements Runnable 
{
	    //int i;
		public void run()
		{
			try
			{
				for(int i = 0; i<10; i++)
				{
				//System.out.println(" Hello My Friends in Oracle ");
				//System.out.println(Thread.currentThread());
				System.out.println("\t Value of i From " + Thread.currentThread() + " is : " + i);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();		
			}
		}

}

public class MyRunnableDemo 
{
		public static void main(String args[])
		{
				Runnable Runobj=new MyRunnableExample();

				Thread obj1=new Thread(Runobj);

				obj1.start();

				Thread obj2 = new Thread(Runobj);

				obj2.start();
		}
}