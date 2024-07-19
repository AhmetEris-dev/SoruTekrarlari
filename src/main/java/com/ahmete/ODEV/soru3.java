package com.ahmete.ODEV;
/*
Soru 3. Kullanıcıdan bir gün numarası (1-7) girmesini isteyin ve hafta sonu mu yoksa hafta içi mi olduğunu belirleyin
. (Switch-Case with Yield)
 */

import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen 1 ile 7 arasında bir gün sayisi giriniz");
		int gunSayisi = scanner.nextInt();
		
		String gun = switch (gunSayisi) {
			case 1, 2, 3, 4, 5 -> {
				System.out.println("hafta içi");
				yield "hafta içi ";
				
			}
			case 6, 7 -> {
				System.out.println("hafta sonu");
				yield "hafta sonu";
				
			}
			default -> "lütfen 1 ile 7 arasında sayi giriniz";
			
		};
		
		
	}
	
	
}