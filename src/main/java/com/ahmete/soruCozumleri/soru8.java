package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru8 {
	/*
	1 den başlayarak kulanıcının girdiği sayiya kadar olan (sayı dahil) sayıların 1 faslasının toplamını ekrana
	yazdıran program
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi=scanner.nextInt();
		int toplam=0;
		for (int i = 1; i <=sayi ; i++) {
			toplam=toplam+(i+1);
		}
		System.out.println("1 den girdiğiniz sayiya kadar olan sayiların 1 fazlasının toplamı: "+toplam);
		scanner.close();
	}
}