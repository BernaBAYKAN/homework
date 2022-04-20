package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class wct {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double ws, t , c, wct  ;
		
		System.out.print("Lütfen rüzgar hızını(km/s) giriniz:");
		 ws = scanner.nextDouble();
		
		System.out.print("Lütfen sıcaklık(C) giriniz:");
		 c = scanner.nextDouble();
		
		 
		 wct  = 13.12 + 0.6215 * c - 11.37 * (Math.pow(ws, 0.16)) + 0.3965 * c * (Math.pow(ws, 0.16));
		
		 
		 t = (c * 9/5) + 32  ; 
		 
		 System.out.println("WindChillTemperature" +" " + wct);
		 System.out.println("Fahrenheit:" +" " + t);
		 
		 
		 scanner.close();
		
	}

}
