package com.ahmete.ODEV;
/*
Soru 5. 1'den 20'ye kadar olan sayıların karelerini ekrana yazdırın. (For)
 */

public class soru5 {
	public static void main(String[] args) {
		int karesi;
		int i;
		
		for (i = 1; i <= 20; i++) {
			karesi = i * i;
			
			
			System.out.println(i + " karesi= " + karesi);
		}
		
	}
}