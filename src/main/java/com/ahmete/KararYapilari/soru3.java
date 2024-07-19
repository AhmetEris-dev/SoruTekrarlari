package com.ahmete.KararYapilari;
/*
Bir seyahat uygulaması yazıyorsunuz ve kullanıcının gideceği şehre göre bilet fiyatını hesaplamanız gerekiyor.
Ankara'ya gidecek kullanıcılara 100 TL,
İstanbul'a gidecek kullanıcılara 200 TL,
 izmir'e gidecek kullanıcılara 150 TL,
 diğer şehirlere gidecek kullanıcılara ise "Geçerli bir şehir seçiniz." mesajı gösterilmelidir.
 */

import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen gideceginiz şehri seciniz");
		String sehir=scanner.nextLine();
		
		if (sehir.equals("ankara")){
			System.out.println("bilet fiyati 100tl");
			
		}
		else if (sehir.equals("istanbul")) {
			System.out.println("bilet fiyati 200tl");
			
		}
		else if (sehir.equals("izmir")) {
			System.out.println("bilet fiyati 150 tl");
			
		}else {
			System.out.println("gecerli bir sehir seciniz");
		}
		
	}
}