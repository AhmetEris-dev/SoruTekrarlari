package com.ahmete.soruCozumleri;
/*
 2 Boyutlu Array'de çarpım tablosunu yazdıralım.
 */

public class soru30 {
	public static void main(String[] args) {
		String[][] sayilar=new String[10][10];
		for (int i = 0; i <sayilar.length ; i++) {
			for (int j = 0; j <sayilar[i].length ; j++) {
				sayilar[i][j]=(i+1)+" x "+(j+1)+" = "+(i*j);
				
			}
			
		}
		for (int i = 0; i <sayilar.length ; i++) {
			for (int j = 0; j <sayilar[i].length ; j++) {
				System.out.println(sayilar[i][j]);
				
			}
			System.out.println();
			
		}
	
		
	}
}