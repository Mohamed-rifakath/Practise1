package org.example;

public class Sting_print {
	
	public static void main(String[] args) {
		
		String a[]= new String [3];
		a[0]="ball";
		a[1]="snack";
		a[2]="swim";
		
		System.out.println(a.length);
		System.out.println(a[2]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}
