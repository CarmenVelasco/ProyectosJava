package com.carmen.me;

import java.util.Random;

public class MiThread extends Thread{
	private int id;
	
	public MiThread(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		
		int low = 1000;
		int high = 5000;
		long ms = r.nextInt(high-low) + low;
		
		
		
	}

}
