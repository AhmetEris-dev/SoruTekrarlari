package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru19 {
	/*
	 *Kullanıcıdan 1'den 7'ye kadar bir sayı isteyelim. Bu sayıya denk gelen haftanın gününü çıktı olarak verelim
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen 1 ile 7 arasında bir sayi giriniz");
		int gun=scanner.nextInt();
		String gunIsmi=switch (gun){
			case 1-> "pazartesi";
			case 2-> "salı";
			case 3->"carsamba";
			case 4->"persembe";
			case 5->"cuma";
			case 6->"cumartesi";
			case 7->"pazar";
			default -> "lütfen 1 ile 7 arasında bir secim yapınız";
		};
		System.out.print(gunIsmi);
		
	}
}