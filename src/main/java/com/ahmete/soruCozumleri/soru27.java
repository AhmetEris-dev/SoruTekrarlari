package com.ahmete.soruCozumleri;
/*
Dizideki bütün sayıların toplamını yazdıralım.
Dizinin her bir elemanı için;
çift ise çifttir, tek ise tektir yazdıralım.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */

import java.util.Arrays;

public class soru27 {
	public static void main(String[] args) {
		int[] sayilar={0, 120, 5, 85, -256, 16, 1258, 81, 14};
		
		int toplam= Arrays.stream(sayilar).sum();
		System.out.println("toplam: "+toplam);
		
		for (int i = 0; i <sayilar.length ; i++) {
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i]+" cifttir");
			}else {
				System.out.println(sayilar[i]+" tektir");
			}
		}
		
	}
	
}