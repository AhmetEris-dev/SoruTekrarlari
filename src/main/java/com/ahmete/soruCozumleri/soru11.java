package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru11 {
	/*
	 Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5 gibi) tabanın kuvvetini hesaplamak
	 istiyorum.
    Hesaplamayı yaptıktan sonra, kullanıcıya ismini soracağım. Sonra çıktı olarak; "kullaniciIsmi + "n üzeri x
    isleminin sonucu " "
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen sayinin taban değerini giriniz");
		int tabanDeger=scanner.nextInt();
		System.out.println("lütfen sayinin üst degerini giriniz");
		int usDeger=scanner.nextInt();
		int sonuc=1;
		scanner.nextLine();
		for (int i = 0; i < usDeger; i++) {
			sonuc*=tabanDeger;
			
		}
		System.out.println("lütfen isminizi giriniz");
		String ad=scanner.nextLine();
		
		System.out.println(ad+"\t"+sonuc);
		
	}
	
}