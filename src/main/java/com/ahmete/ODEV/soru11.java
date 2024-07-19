package com.ahmete.ODEV;
/*
Soru 11. Kullanıcıdan bir metin alın ve bu metindeki sesli harfleri sayın. (String fonksiyonları)
 */

import java.util.Scanner;

public class soru11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir metin giriniz");
		String metin = scanner.nextLine();
		int index = 0;
		
		for (int j = 0; j < metin.length(); j++) {
			char ch = metin.charAt(j);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// program ı,ü,ö harfleri türkce karakter olduğu için sesli harf olarak ekleyemedim
				
				index++;
			}
			
		}
		System.out.println("sesli harf sayisi: " + index);
		
	}
}