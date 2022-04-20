package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;
//Berna BAYKAN
// Kullanıcıdan aldığı not değerine göre harf notu hesaplayan program
public class harfNotu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double vize1, vize2 ;
		double fin, not ;
		
		System.out.print("Lütfen vize1 giriniz:");
		vize1 = scanner.nextDouble();
		
		System.out.print("Lütfen vize2 giriniz:");
		vize2 = scanner.nextDouble();
		
		System.out.print("Lütfen final giriniz:");
		 fin = scanner.nextDouble();
		
		not = (( vize1 + vize2 )* 0.2 ) + ( fin * 0.6 );
				
		int degerlendirilenNot = (int)Math.round(not)/ 10; 
		
		switch ( degerlendirilenNot ) {
		
		case 8,9,10:
		  System.out.println("AA");
		
		case 7:
			System.out.println("BB");
	   
		case 6:
			System.out.println("CC");
			
		case 5:
			System.out.println("DD");
		
		case 4,3,2,1:
			System.out.println("FF");
		    break;
		default :
			System.out.println("Hatalı not girişi");
		
		}
		scanner.close();

	}

}
