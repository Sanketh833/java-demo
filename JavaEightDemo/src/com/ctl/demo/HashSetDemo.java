package com.ctl.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	
	protected Integer addmethod(int a, int b) {
		
		return a +b; 
		
 
		
	}

	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<String> setstr= new HashSet<>();
				
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		setstr.add("sake");
		setstr.add("kiklo");
		
		System.out.println("set contains"+ set.contains(2));
		System.out.println(set.contains(4));
		System.out.println(set.size());
		
		Iterator it = set.iterator();
		System.out.println(it.hasNext());
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}
