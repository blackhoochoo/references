package com.hoochootong.references.concurrency;

import java.util.concurrent.Callable;

public class CallableImpl<T> implements Callable {

	public Object call() throws Exception {
		System.out.println("CallableImpl 호출");
		System.out.println("100초 대기..");
		Thread.sleep(1000);
		System.out.println("CallbleImpl 종료");
		return 1000;
	}

}
