package com.ahmete.Donguler.While;
/*
1'den 100'e kadar olan sayıların toplamını while ile hesaplayan bir program yazınız:
 */

public class soru5 {
	public static void main(String[] args) {
		int sayi,toplam;
		toplam=0;
		sayi=1;
		
		while (sayi<=100){
			toplam+=sayi;
			sayi++;
			
		}
		System.out.println(toplam);
	}
}