package com.threads;

class CreationThreadDemo1 extends Thread {

	public void run() { // imp method given by thread class java

		// logic part
		try {
			for (int i = 1; i < 10; i++) {
				Thread.sleep(5000);
				System.out.println(i);
			}

		} catch (Exception e) {

			System.out.println("exception caught" + e);

		}

	}

}

public class CreationThreadDemo {

	public static void main(String ar[]) {

		CreationThreadDemo1 creationthreaddemo1 = new CreationThreadDemo1();// created the object of a class

		creationthreaddemo1.start();
	}
}
