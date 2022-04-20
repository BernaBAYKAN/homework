package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		
		double boy,agirlik, bmi ; 
		String cinsiyet;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Boy(cm) giriniz:");
		boy = scanner.nextDouble();

		System.out.print("Lütfen Agirlik(kg) giriniz:");
		agirlik = scanner.nextDouble();
		
		scanner.nextLine();

		System.out.print("Lütfen cinsiyet(K/E) giriniz:");
		cinsiyet = scanner.nextLine();

		scanner.close(); 

		bmi = ( agirlik * 10000 ) / ( boy * boy );
		 

		if  ( cinsiyet.equals("K")  ) {
			if (bmi < 19) {
		System.out.println("ZAYIF" );

			}else if ( bmi < 24) {
		System.out.println("NORMAL" );

			}else if ( bmi <  30) {
		System.out.println("ŞİŞMAN" );

			}else {
		System.out.println("OBEZ" );
			}
		 
		else if  ( cinsiyet.equalsIgnoreCase("E")  ) {
			if (bmi <  20) {
		System.out.println("ZAYIF" );

			}else if ( bmi < 25) {
		System.out.println("NORMAL" );

			}else if ( bmi < 30) {
		System.out.println("ŞİŞMAN" );

			}else {
		System.out.println("OBEZ" );
			}
			
		else {
				System.out.println("Hatalı Giriş!!!" );
			}
		 
		}


		}

	}

}
