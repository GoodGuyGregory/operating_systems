import java.util.*;
import java.io.*;

//Creates MyThread Class as an extention of Thread
class MyThread extends Thread {

	// Thread class has a run method which can be implemented
	public void run() {
		System.out.println("Test From RUN Method");
	}

}

// Main Class
public class TestThread()
{
	
	// Main Method
	public static void main(String arg[]) {
		MyThread thread1, thread2;

		//creates Threads for implementation

		thread1 = new MyThread();
		thread2 = new MyThread();

		// starts the threads
		thread1.start();
		thread2.start();
	}
}
