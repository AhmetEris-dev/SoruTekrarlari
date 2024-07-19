package com.ahmete.Donguler.While;
/*
Kullanıcıdan alınan sayıların toplamını hesaplayan bir java programı yazın.( Kullanıcı 0 girene kadar program çalışmaya devam etsin.)
 */

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lutfen toplamak istediğiniz sayileri giriniz. eğer sıfır girerseniz program durur");
		
		int sayi=scanner.nextInt();scanner.nextLine();
		int toplam=0;
		
		while (sayi!=0){
			
			toplam+=sayi;
			System.out.println("Bir sayı girin (0'a basarak sonlandırabilirsiniz)");
			sayi=scanner.nextInt(); scanner.nextLine();
		}
		System.out.println(toplam);
	}
}