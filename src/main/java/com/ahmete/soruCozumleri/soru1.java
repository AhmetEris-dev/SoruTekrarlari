package com.ahmete.soruCozumleri;
/*
 * Bir ürünün fiyatında %18 kdv ve %15 kar oldugunu biliyoruz. bir urun fiyati olsun bu urun fiyatından ham
 * fiyatını bulalaım
 */

public class soru1 {
	public static void main(String[] args) {
		float fiyat=100,kdvsizfiyat,kdvOrani=0.18f,karOrani=0.15f,hamfiyat;
		
		kdvsizfiyat=fiyat-(fiyat*kdvOrani);
		System.out.println("kdvsiz fiyat"+kdvsizfiyat);
		
		hamfiyat=kdvsizfiyat-(kdvsizfiyat*karOrani);
		System.out.println("hamfiyat"+hamfiyat);
		
	}
	
	
	
	
	
}