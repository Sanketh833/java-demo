package com.ctl.demo;

public class StaticClassDemo {

	public static class NestedClass {

		public static Integer add(int a, int b) {
			System.out.println(a + b);
			return a + b;
		}
	}

	public static Integer demomethod(int a, int b) {
		System.out.println(a + b);
		return a + b;

	}

	public static String Abc = "sanketh";

}

class Demo {
	public static void main(String[] args) {

		StaticClassDemo.demomethod(4, 6);
		String a = StaticClassDemo.Abc;
		System.out.println(a);
		StaticClassDemo.NestedClass.add(4, 1);
	}

}
