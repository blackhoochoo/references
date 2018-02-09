package com.hoochootong.references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> rList = new ArrayList<>();
		rList.add("1");
		map.put("one", rList);
		map.put("two", Arrays.asList("22"));
		List<String> rrList = map.get("one");
		rrList.add("2");
		rrList.add("11111");
		System.out.println(map.get("one"));
		
	}
}
