package com.ahmete.ODEV;
/*
Soru 4. Kullanıcıdan bir sayı alın ve bu sayıya kadar olan çift sayıları ekrana yazdırın. (For)
 */

import java.util.Scanner;

public class soru4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		
		
		for (int i = 0; i <= sayi; i = i + 2) {
			
			System.out.println(i);
		}
		
	}
}