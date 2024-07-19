package com.ahmete.ODEV;
/*
Soru 12. Kullanıcıdan bir taban ve üs değeri alın ve üssü hesaplayın. (Math fonksiyonları)
 */

import java.util.Scanner;

public class soru12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir taban değeri giriniz");
		int tabandeger = scanner.nextInt();
		System.out.println("lütfen bir üst değeri giriniz");
		int ustdeger = scanner.nextInt();
		
		
		System.out.println("sonuc: " + Math.pow(tabandeger, ustdeger));
	}
}