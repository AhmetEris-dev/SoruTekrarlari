package com.ahmete.ODEV;
/*
Soru 13. Kullanıcıdan bir sayı alın ve bu sayının en yakın tam sayıya yuvarlanmış halini bulun. (Math fonksiyonları)
 */

import java.util.Scanner;

public class soru13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir sayi giriniz");
		float sayi=scanner.nextFloat();
		
		System.out.println(Math.round(sayi));
	
	}
}