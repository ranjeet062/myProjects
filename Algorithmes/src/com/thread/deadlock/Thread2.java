package com.thread.deadlock;

public class Thread2 implements Runnable {

	SharedObject obj1 = null;
	SharedObject obj2 = null;

	public Thread2(SharedObject obj1, SharedObject obj2) {

		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		synchronized (obj2) {
			System.out.println("Thread2 holding lock 1");
			//obj1.m1();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("thread2 waiting for lock");
			synchronized (obj1) {
				System.out.println("Thread2 holding lock 1, 2");
			}
		}

	}
}
