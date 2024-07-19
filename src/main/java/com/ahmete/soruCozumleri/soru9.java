package com.ahmete.soruCozumleri;

public class soru9 {
	/*
	 den başlayarak gelen bütün sayıları toplayalım. Toplamımız 50'yi geçene kadar çalışsın.
     En son toplamı yazdıralım ve bu döngünün kaç kere çalıştığını yazdıralım.
	 */
	public static void main(String[] args) {
		int toplam;
		int limit=50;
		int i=0;
		for (toplam = 0; toplam<limit ; i++) {
			toplam+=i;
			
		}
		System.out.println(toplam+" dongu "+(i-1));
		
	}
}