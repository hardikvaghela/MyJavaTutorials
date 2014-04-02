package com.hardik;

public class ExampleArray {
public static void main(String[] args)
{
	int[] a = {1,2,3,4,5,6,7,8,9};
	System.out.println(a[3]);
	//foreach
	for(int i:a)
	{
		System.out.println("Number is" + i);
	}
	
	
	
	
	String[] names = {"Hardik", "SUmit", "Rajvi"};  
	for(String temp:names)
	{
		System.out.println("Name is " + temp);
	}
}
}
