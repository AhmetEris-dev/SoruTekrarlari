package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru6 {
	/*
	 * dısarıdan 2 adet tam sayi degeri alalım iki sayinin toplamı cift iste true değil ise false yazdıralım bu
	 * değerlerin bir de ortalamasını alalım ve yazdıralım
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen toplamak istediğiniz birinci sayiyi giriniz");
		int sayi1=scanner.nextInt();
		System.out.println("lütfen toplamak istediğiniz ikinci sayiyi giriniz");
		int sayi2=scanner.nextInt();
		int toplam=0;
		toplam=sayi1+sayi2;
		if (toplam%2==0){
			System.out.println("iki sayinin toplamı= "+toplam+" cifttir");
		}else {
			System.out.println("iki sayinin toplamı= "+toplam+" tektir");
			
			double ortlama=toplam/2.0;
			System.out.println("iki sayinin ortalaması= "+ortlama);
		}
	}
}