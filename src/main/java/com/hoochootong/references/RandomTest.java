package com.hoochootong.references;

import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
	public static void main(String[] args) {
		int res = ThreadLocalRandom.current().nextInt(0, 5 + 1);
		System.out.println(res);
	}
}
