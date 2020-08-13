package com.thread.problems;

public class TestPC {

	public static void main(String[] args) throws InterruptedException {

		ProducerConsumer pc = new ProducerConsumer();
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.produces();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				pc.consumes();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
