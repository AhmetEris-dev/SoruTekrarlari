package com.ahmete.soruCozumleri;
/*
Kulanıcının girdiği sayının çarpım tablosunu yazdıran program.
     (Kullanıcı 7 girdiğinde 7'nin çarpım tablosu elemanları görünecek. )
 */

import java.util.Scanner;

public class soru14 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen carpım tablosunu gormek istedğiniz sayiyi giriniz");
		int sayi=scanner.nextInt();
		
		for (int i = 1; i <=10 ; i++) {
			System.out.println(i+"x"+sayi+"="+(sayi*i));
		}
	}
	
}