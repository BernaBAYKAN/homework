package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class alanHesap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double s,alan;
		int n;
		
		System.out.print("Lütfen çokgenin kenar sayısını giriniz:");
		n = scanner.nextInt();
		
		System.out.print("Lütfen çokgenin bir kenar uzunluğunu giriniz:");
		s = scanner.nextDouble();
		
		alan = ((n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n )));
		
		System.out.println("Alan" +" " + alan );
		
		
		scanner.close();

	}

}
