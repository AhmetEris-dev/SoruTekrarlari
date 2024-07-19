package com.ahmete.ODEV;
/*
Soru 14. 1 ile 50 arasında rastgele bir sayı üretin ve bu sayının çift mi tek mi olduğunu belirleyin.

(Random Sınıfı)
 */

import java.util.Random;

public class soru14 {
	public static void main(String[] args) {
		Random random=new Random();
		int sayi=random.nextInt((50)+1);
		System.out.println(sayi);
		
		if (sayi%2==0){
			System.out.println(sayi+" cifttir");
		}else {
			System.out.println(sayi+" tektir");
		}
		
	}
}