package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru4 {
	/*
	 *kullanıcıdan önce yasını sonrasında kullanıcının ismini girdi olarak isteyelim ve yasını ekrana yazdıralım
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("lutfen yasınızı giriniz");
		int yas=scanner.nextInt();scanner.nextLine();
		System.out.print("lutfen isminizi giriniz");
		String isim=scanner.nextLine();
		System.out.println(yas);
	}
}