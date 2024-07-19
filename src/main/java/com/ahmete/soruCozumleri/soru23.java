package com.ahmete.soruCozumleri;
/*
Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
 */


import java.util.Scanner;

public class soru23 {
	public static void main(String[] args) {
		String[] ulkeArr={"Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir ulke ismi giriniz");
		String ulke=scanner.nextLine();
		boolean varMi=false;
		for (int i = 0; i<ulkeArr.length ; i++) {
			if (ulkeArr[i].equalsIgnoreCase(ulke)){
				varMi=true;
				break;
			}
		}
		if (!varMi){
			System.out.println("ulke mevcut");
		}else {
			System.out.println("ulke mevcuz değil");
		}
	}
}