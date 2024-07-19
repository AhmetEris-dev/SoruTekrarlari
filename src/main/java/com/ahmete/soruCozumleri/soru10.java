package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru10 {
	/*
	 girilen sayının basamakları toplamını ekrana yazdıralım.
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir sayi giriniz");
		int sayi=scanner.nextInt();
		int toplam=0;
		int basamak;
		for (int i = 0; i <sayi ; i++) {
			basamak=sayi%10;
			toplam+=basamak;
			sayi /=10;
			
		}
		System.out.println(toplam);
	}
}