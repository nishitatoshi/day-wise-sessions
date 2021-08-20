package com.techment.day14;

//class Message extends Thread
//{
//	public void run()
//	{
//		System.out.println("this is my task");
//	}
//}

class Info implements Runnable
{

	@Override
	public void run() {
		System.out.println("this is my task");
		
	}
	
}

public class CreatingThreadByImplementsRunnable {

	public static void main(String[] args) {
		
//		Message message = new Message();
//		message.start();
		
		Info info = new Info();
		Thread thread = new Thread(info);
		thread.start();

	}

}
