package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class IfElse {
//Kullanıcıdan girdiği sayının Negatif mi?Pozitif mi? olduğunu bulan java programı.
	public static void main(String[] args) {
//		int x,y ;
//		x = 2;
//		y = 5;
//		
//		if(x < y) {
//			System.out.println("x is smaller than y.");
//		}else if (x == y) {
//		  System.out.println("x is equal to y.");
//		}else {
//			System.out.println("x is greater than y.");
//		}
//		Scanner scanner = new Scanner(System.in); 
		
		double sayi ; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz:");
		sayi = scanner.nextDouble();
		scanner.close();
		
		if ( sayi > 0 ) {
			
			System.out.println("Sayı POZİTİFTİR." );
		
		}else if(sayi == 0 ) {
			System.out.println("Sayı SIFIRDIR" );
		}
		else {
			System.out.println("Sayı NEGATİFTİR." );
		}

   }

}	


		
 
	
		
		
		
		
		