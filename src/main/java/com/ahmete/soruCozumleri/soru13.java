package com.ahmete.soruCozumleri;
/*
 3- Klavyeden 0 girilinceye kadar sayı okumaya devam edelim.
  0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.
 */

import java.util.Scanner;

public class soru13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen sayi giriniz");
		int sayi=scanner.nextInt();
		int toplam=0;
		while (sayi!=0){
			
			toplam+=sayi;
			System.out.println("lütfen sayi giriniz");
			sayi=scanner.nextInt();
		}
		System.out.println(toplam);
		
	}
}