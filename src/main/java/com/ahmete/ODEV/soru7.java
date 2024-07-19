package com.ahmete.ODEV;
/*
Soru 7. Kullanıcıdan bir sayı alın ve bu sayının basamakları toplamını hesaplayın. (While)
 */

import java.util.Scanner;

public class soru7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		
		while (sayi > 0) {
			int basamak = sayi % 10;
			toplam += basamak;
			sayi /= 10;
		}
		System.out.println(toplam);
	}
}