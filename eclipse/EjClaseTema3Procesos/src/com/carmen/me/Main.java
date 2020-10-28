package com.carmen.me;

public class Main {
	
	public void main (String [] args) {
		MiThread t1 = new MiThread(1);
		MiThread t2 = new MiThread(2);
		MiThread t3 = new MiThread(3);
		MiThread t4 = new MiThread(4);
		MiThread t5 = new MiThread(5);
		
		t1.start(); //run() no
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		System.out.println("Termina el programa principal");
		
	}

}
