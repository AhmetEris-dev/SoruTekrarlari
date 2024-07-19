package com.ahmete.Donguler.forDongusu;

import java.util.Scanner;

/*
 1 den n e kadar olan sayıların toplamını for dongusu ile yazdırın
 */
public class soru1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi=scanner.nextInt();
		int toplam=0;
		
		for (int i = 1; i <=sayi ; i++) {
			
			toplam+=i;
			
			
			
		}
		System.out.println(toplam);
	}
}