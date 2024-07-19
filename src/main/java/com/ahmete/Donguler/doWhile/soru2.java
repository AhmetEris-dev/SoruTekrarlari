package com.ahmete.Donguler.doWhile;

import java.util.Scanner;

public class soru2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen faktoriyeli alınacak sayiyi giriniz");
		int sayi=scanner.nextInt();
		int faktoriyel=1;
		do {
			faktoriyel*=sayi;
			sayi--;
		}while (sayi>0);
		
		System.out.println(sayi+"! = "+faktoriyel);
	}
}