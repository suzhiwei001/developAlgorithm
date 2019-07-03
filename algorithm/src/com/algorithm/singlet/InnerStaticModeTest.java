package com.algorithm.singlet;

import java.util.Vector;

public class InnerStaticModeTest {
	
	static Vector<InnerStaticMode> vector = new Vector<InnerStaticMode>();
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread() {
				public void run() {
					InnerStaticMode innerStaticMode = new InnerStaticMode();
					vector.addElement(innerStaticMode);
				};
			}.start();
			
		}		
	}
/*	static class A implements Runnable{

		@Override
		public void run() {
			System.out.println("数据个数"+vector.size());
		}
		
	}*/
}
