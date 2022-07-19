package com.bgl.first;

import java.util.Scanner;

public class PowerOfTwo {

	
	    /* Function to check if x is power of 2*/
	    static boolean isPowerOfTwo(int n)
	    {
	        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
	            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int m=sc.nextInt();
	        if (isPowerOfTwo(m))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	 
	        if (isPowerOfTwo(m))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
	}
	 
