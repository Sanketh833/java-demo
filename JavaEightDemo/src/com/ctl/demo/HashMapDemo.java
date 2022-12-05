package com.ctl.demo;

import java.nio.MappedByteBuffer;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 101);
		map.put("China", 102);

		map.put("China", 104);
		map.put("USA", 102);

		System.out.println(map);
		System.out.println(map.containsValue(102));
		System.out.println(map.replace("China", 102, 103));
		System.out.println(map);

//		Search in HashMap

		if (map.containsKey("India")) {

			System.out.println("exists");

		}

		System.out.println(map.get("China"));

//		iteration in map
//		EnhancedForLoop for(val : arr)

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e);
			System.out.println(e);
		}

		System.out.println("****");
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(".............");

		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {

			System.out.println(key + " " + map.get(keys));
		}

	}
//	Set the keys together

}
