package com.ahmete.SoruCozumleriIki;

import java.util.Scanner;

public class soru2 {
	/*
	Kullanıcıdan alınan sayının faktöryelini bulan programı while kullanarak yazınız.
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen faktoriyelini almak istediğiniz sayiyiyi giriniz");
		int sayi=scanner.nextInt();
		int faktoriyel=1;
		while (sayi>0){
			faktoriyel*=sayi;
			sayi--;
		}
		System.out.println(faktoriyel);
	}
}