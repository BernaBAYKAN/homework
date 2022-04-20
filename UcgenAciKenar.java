package com.bilgeadam.boost.java.course02.lesson008;

import java.util.Scanner;

public class UcgenAciKenar {
// 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		double x,y,z,a,b,c;
		
		System.out.print("Lütfen üçgenin ilk açısını giriniz:");
		x = scanner.nextDouble();

		System.out.print("Lütfen üçgenin ikinci açısını giriniz:");
		y = scanner.nextDouble();
		
		System.out.print("Lütfen üçgenin kenarını giriniz:");
		a = scanner.nextDouble();
		
		System.out.print("Lütfen üçgenin kenarını giriniz:");
		b = scanner.nextDouble();
		
		z = 180 - (x + y);
		
		 double zRad = Math.toRadians(z) ;
		
		double temp = Math.pow(a, 2) + Math.pow(b, b) - (2 * a * b *( Math.cos(zRad)));
		
		c = Math.sqrt(temp)  ; 
		
		System.out.println("üçgenin 3.Açısı:" +" " + z  +"kenar uzunluğu:"+" " + c );
		
		scanner.close();
		
		
	}

}
