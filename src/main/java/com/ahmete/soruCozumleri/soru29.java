package com.ahmete.soruCozumleri;
/*
Dizide 13 sayısına denk gelene kadar devam edelim.
    13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13 değil ise 13'den sonra gelen sayıyı toplama ekleyelim.
    -> 1, 13, 13, 13, 5, 13
 */

public class soru29 {
	public static void main(String[] args) {
		int[] sayilar={1, 13, 13, 13, 5, 13};
		int toplam=0;
		for (int i = 0; i <sayilar.length-1 ; i++) {
			if (sayilar[i]==13&&sayilar[i+1]!=13){
				toplam+=sayilar[i+1];
			}
			
		}
		System.out.println(toplam);
	}
}