package com.ahmete.ODEV;
/*
Soru 8. Bir tamsayının faktöriyelini, kullanıcı negatif bir sayı girene kadar tekrar tekrar hesaplayın. (While)
 */

import java.util.Scanner;

public class soru8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen faktoriyelini almak istediğiniz sayiyi giriniz");
		int sayi = scanner.nextInt();
		int faktoriyel = 1;
		
		while (sayi > 0) {
			for (int i = 1; i <= sayi; i++) {
				faktoriyel *= i;
				
			}
			System.out.println(faktoriyel);
			
			System.out.println("lütfen faktoriyelini almak istediğiniz sayiyi giriniz");
			sayi = scanner.nextInt();
			
			faktoriyel = 1;
			
			
		}
		System.out.println("program sonlandırılmıştır");
		
		
	}
}