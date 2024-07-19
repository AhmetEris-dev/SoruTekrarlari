package com.ahmete.ODEV;
/*
Soru 2. Kullanıcıdan bir sayı girmesini isteyin ve bu sayının 1-12 arasında bir değer olduğunu varsayarak, ayın
ismini ekrana yazdırın. (Switch-Case)
 */

import java.util.Scanner;

public class soru2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen 1 ile 12 arasında bir sayi giriniz");
		int sayi = scanner.nextInt();
		String ay;
		
		ay = switch (sayi) {
			case 1 -> "Ocak Ayı";
			case 2 -> "Subat Ayı";
			case 3 -> "Mart Ayı";
			case 4 -> "Nisan Ayı";
			case 5 -> "Mayıs Ayı";
			case 6 -> "Haziran Ayı";
			case 7 -> "Temmuz Ayı";
			case 8 -> "Ağustos Ayı";
			case 9 -> "Eylül Ayı";
			case 10 -> "Ekim Ayı";
			case 11 -> "Kasım Ayı";
			case 12 -> "Aralık Ayı";
			
			default -> "lütfen 1 ile 12 arasında bir sayi giriniz";
		};
		System.out.println(ay);
	}
}