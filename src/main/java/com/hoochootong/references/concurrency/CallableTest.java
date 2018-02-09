package com.hoochootong.references.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableTest {

	public static void main(String[] args) {
		// Callabel은 객체 반환이 가능한 Generic타입의 인터페이스
		CallableImpl<Integer> callable1 = new CallableImpl<Integer>();
		CallableImpl<Integer> callable2 = new CallableImpl<Integer>();
		CallableImpl<Integer> callable3 = new CallableImpl<Integer>();
		CallableImpl<Integer> callable4 = new CallableImpl<Integer>();
		CallableImpl<Integer> callable5 = new CallableImpl<Integer>();
		CallableImpl<Integer> callable6 = new CallableImpl<Integer>();
		
		
		ExecutorService executor = Executors.newFixedThreadPool(20);
		
		
		List<Callable> futures = new ArrayList<Callable>();
		futures.add(callable1);
		futures.add(callable2);
		futures.add(callable3);
		futures.add(callable4);
		futures.add(callable5);
		futures.add(callable6);
		List<Future> futureList = null;
		
		try {
			futureList = (List<Future>)executor.invokeAll((Collection)futures);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


			
		try {
			for (Future future : futureList) {
				System.out.println(future.get());
			} 			
		} catch (Exception e) {
		
		}


		executor.shutdown();
		try {
			if(! executor.awaitTermination(5,  TimeUnit.SECONDS) ) {
				System.out.println("아직 처리중인 작업 존재");
				System.out.println("작업 강제 종료");
				
				if(! executor.awaitTermination(5, TimeUnit.SECONDS)) {
					System.out.println("여전이 종료하지 않은 작업 존재");
				}
			}
		} catch (InterruptedException e) {
			executor.shutdownNow();
			Thread.interrupted();
		}
		
		System.out.println("서버 셧다운 완료");
		
		
		Integer result = -1;

		
		System.out.println(result);
		
		
	}
}
