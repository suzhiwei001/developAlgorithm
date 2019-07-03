package com.test.thread;

public class TestMethod implements Runnable{
	private ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    private static int number;

    TestMethod(){
        number = 0;
    }

	@Override
	public void run() {
		
        String name = Thread.currentThread().getName();
        if(name.equalsIgnoreCase("thread1")){
        	threadLocal.set("1");
        	threadLocal.set("3");
        	System.out.println("1----"+threadLocal.get());
            m1();
        }else{
            m2();
            threadLocal.set("2");
            System.out.println("2----"+threadLocal.get());
        }
	}
    public synchronized void m1(){
        for(int i=0;i<3;i++){
            try {
                System.out.println(Thread.currentThread().getName()+":"+(number++)+"m1");
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println("异常");
            }
        }
    }


    public synchronized void m2(){
        for(int i=0;i<3;i++){
            try {
                System.out.println(Thread.currentThread().getName()+":"+(number++)+"m2");
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println("异常");
            }
        }
    }
    public static void main(String[] args) {
    	TestMethod testMethod = new TestMethod();
        TestMethod testMethod2 = new TestMethod();
        Thread thread1  = new Thread(testMethod,"thread1");
        Thread thread2 = new Thread(testMethod2,"thread2");
        thread1.start();
        thread2.start();
	}
}
