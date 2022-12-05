package com.ctl.parsing;
public class GFG {
	 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Double datatype
//        double d = 100.04123456789;
 
        // Explicit type casting by forcefully getting
        // data from long datatype to integer type
//        long l = (long)d;
 
        // Explicit type casting
//        int i = (int)l;
 
        // Print statements
//        System.out.println("Double value " + d);
 
        // While printing we will see that
        // fractional part lost
//        System.out.println("Long value " + l);
 
        // While printing we will see that
        // fractional part lost
//        System.out.println("Int value " + i);
    	
    	
    	double d = 1090.9929034567;
    	
    	int i = (int)d;
    	float f = (float)d;
    	long l = (long) d;
    	System.out.println(i);
    	System.out.println(f);
    	System.out.println(l);
    }
}
