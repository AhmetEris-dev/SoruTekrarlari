package com.ahmete.Donguler.doWhile;
/*
Kullanıcıdan alınan sayıların toplamını hesaplayan bir java programı do while ile yazın.( Kullanıcı 0 girene kadar program çalışmaya devam etsin.)
 */

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sayi;
		int toplam=0;
		
		do {
			System.out.println("bir sayi giriniz(0 sayisini girdiğinizde program sonlanır)");
			 sayi=scanner.nextInt();
			toplam+=sayi;
			
			
		}while(sayi!=0);
		
		System.out.println(toplam);
		
		
	}
}