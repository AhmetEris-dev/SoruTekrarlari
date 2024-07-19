package com.ahmete.soruCozumleri;
/*
Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız
 */

import java.util.Scanner;

public class soru21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen kelime giriniz");
		String kelime = scanner.nextLine();
		int sayac=0;
		int index=0;
		char ch='a';
		while (index<kelime.length()){
			if (kelime.charAt(index)==ch){
				sayac++;
			}
			index++;
		}
		System.out.println(sayac);
	}
}