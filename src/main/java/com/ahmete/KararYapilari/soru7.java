package com.ahmete.KararYapilari;
/*
Bir öğrencinin notunu aldığımızda,
notu 50'den büyük veya eşitse "Geçer",
küçükse "Kaldı" şeklinde bir durum göstermek için ternary operatörü kullanılarak programı yazınız.
 */

public class soru7 {
	public static void main(String[] args) {
		int not=55;
		
		String sonuc = (not<=50 && not>0 ) ? "kaldı": "gecti ";
		System.out.println(sonuc);
		
	}
	
}