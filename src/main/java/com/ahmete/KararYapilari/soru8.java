package com.ahmete.KararYapilari;
/*
Bir sayının tek / çift olduğunu ternary operatörü ile belirleyen programı yazınız.
 */

public class soru8 {
	public static void main(String[] args) {
		
		int sayi=19;
		
		String sonuc=(sayi%2==0)? "cift":"Tek";
		System.out.println(sonuc);
	}
}