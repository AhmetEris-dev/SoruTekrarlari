package com.ahmete.ODEV;

import java.util.Random;

/*
Soru 15. Rastgele bir sayı üretin ve bu sayının 1 ile 10 arasında olup olmadığını kontrol edin.

(Random Sınıfı)
 */
public class soru15 {
	public static void main(String[] args) {
		
		
		// sayi sinirlaması olmayan
		Random random=new Random();
		int sayi = random.nextInt();
		System.out.println(sayi);
		
		if (sayi>=1 && sayi<=10){
			System.out.println("sayi 1 ile 10 arasındadır");
		}else {
			System.out.println("sayi 1 ile 10 arasında değildir");
		}
		
		
		//sayi sınırlaması olan
		int sayi2= random.nextInt((100)+1);
		System.out.println(sayi2);
		if (sayi2>=1 && sayi2<=10){
			System.out.println("sayi 1 ile 10 arasındadır");
		}else {
			System.out.println("sayi 1 ile 10 arasında değildir");
		}
	}
}