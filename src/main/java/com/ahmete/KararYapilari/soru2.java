package com.ahmete.KararYapilari;
/*
Soru: Bir matematik oyunu yazıyorsunuz ve kullanıcının verilen soruya doğru cevap verip vermediğini kontrol etmeniz
gerekiyor.
 * Eğer kullanıcı doğru cevap verirse "Tebrikler! Doğru cevap.", yanlış cevap verirse "Maalesef yanlış cevap, tekrar
 dene." mesajı gösterilmelidir.
 * int soru=10;
 * int cevap=20;
 */

public class soru2 {
	public static void main(String[] args) {
		int soru = 20;
		int cevap = 20;
		
		if (soru == cevap) {
			System.out.println("Tebrikler! doğru cevap");
		}
		else {
			System.out.println("Maalesef yanlış cevap, tekrar dene");
		}
	}
}