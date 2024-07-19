package com.ahmete.ODEV;
/*
Soru 6. Kullanıcıdan negatif bir sayı girene kadar sayı girmesini isteyin ve girilen pozitif sayıları toplayın.
(Do-While)
 */

import java.util.Scanner;

public class soru6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sayi;
		int toplam = 0;
		
		do {
			System.out.println(toplam);
			System.out.println("lütfen toplamak istediğiniz pozitif sayiyi giriniz.(negatif bir sayi girdiğinizde " +
					                   "program duracaktır!!!)");
			sayi = scanner.nextInt();
			toplam += sayi;
			
			
		} while (sayi > 0);
		System.out.println("program sonlandırıldı");
		
		
	}
}