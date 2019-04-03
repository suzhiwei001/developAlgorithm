package com.algorithm.threadTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec=Executors.newCachedThreadPool();
        List<Future<String>> results=new ArrayList<Future<String>>();
        
        for(int i=0;i<5;i++) {
            results.add(exec.submit(new TaskWithResult(i)));
           // System.out.println(exec.submit(new TaskWithResult(i)).get());
        }
        
        for(Future<String> fs :results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
	}
}
