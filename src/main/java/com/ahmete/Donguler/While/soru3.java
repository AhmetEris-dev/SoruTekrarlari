package com.ahmete.Donguler.While;
/*
Kullanıcının girdiği kelimenin harf sayısını while ile bulan programı yazınız.
Deneme 6
 */

import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir kelime giriniz");
		String kelime=scanner.nextLine();
		System.out.println("harf sayisi= "+kelime.length());
		
		
	}
}