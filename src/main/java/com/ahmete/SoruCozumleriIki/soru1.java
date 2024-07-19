package com.ahmete.SoruCozumleriIki;

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		/*
		Kullanıcıdan alınan sayıların toplamını hesaplayan bir java programı yazın.( Kullanıcı 0 girene kadar program çalışmaya devam etsin.)
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir sayi giriniz");
		int sayi=scanner.nextInt();
		int toplam=0;
		while (sayi!=0){
			toplam+=sayi;
			System.out.println("lütfen bir sayi giriniz");
			sayi=scanner.nextInt();
			
			
		}
		System.out.println(toplam);
	}
}