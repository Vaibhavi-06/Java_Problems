import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool
{
	public static void main(String args[])
	{
		ExecutorService executor=Executors.newFixedThreadPool(5);

		for(int i=0;i<20;i++)
		{
			Runnable worker=new WorkerThread(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
	
		while(!executor.isTerminated()){}

		System.out.println("All threads finish");
	}
}


//ThreadGroup

//SHutDownHook-Special type thread in java-jvm by close
//automatically executed when JVM gets shutdown
//it close the database connection
//it close files connection
//it is used to maintain logs
//it use relase resources of system


//ThreadPool-working group thread task perform

//newFixedThreadPool(int n)