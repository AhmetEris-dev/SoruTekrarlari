package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru7 {
	/*
	 * dırsarıdan girilen bir sayinin faktoriyelini alalım
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen faktoriyelini almak istediğiniz sayiyi giriniz");
		int sayi=scanner.nextInt();
		int faktoriyel=1;
		for (int i = 1; i <=sayi ; i++) {
			faktoriyel *= i;
			if (i == sayi) {
				System.out.print(sayi);
			}
			else {
				System.out.print(i+"*");
			}
		}
		System.out.print("="+faktoriyel);
		
	}
}