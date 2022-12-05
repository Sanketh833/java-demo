package com.ctl.collections;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListdemo implements Serializable, Cloneable, RandomAccess {

	public void ALdemo() {
		ArrayList ar = new ArrayList<>();
		ar.add(1);
		ar.add("sanketh");
		ar.add(2, "sankethS");
		System.out.println(ar.contains(1));
		
		File file = new File("arraylistdemo.txt");
		
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(ar);
			oos.close();
			System.out.println("vjasckan");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		ArrayListdemo arrayListdemo = new ArrayListdemo();
		arrayListdemo.ALdemo();
	}

}
