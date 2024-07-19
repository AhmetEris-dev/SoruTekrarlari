package com.ahmete.KararYapilari;
/*
Kullanıcının girdiği ürün fiyatına göre(scanner) indirim uygulayan bir program yazmanız gerekiyor.
	Ürün fiyatı 1000 TL veya üzerinde ise %20,
			500-999 TL arası %10,
			100-499 TL arası %5 indirim uygulanacaktır.
	Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.
 */

import java.util.Scanner;

public class soru5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen urun fiyatını giriniz");
		int urun = scanner.nextInt();
		
		if (urun >= 1000) {
			System.out.println("İndirimli ürün fiyati: " + urun * 0.8 + "TL");
		}
		else if (urun >= 500) {
			System.out.println("İndirimli ürün fiyati: " + urun * 0.9 + "TL");
			
		}
		else if (urun >= 100) {
			System.out.println("İndirimli ürün fiyati: " + urun * 0.95 + "TL");
			
		}
		else {
			System.out.println("Ürün fiyati en az 100TL  olamalıdır");
		}
	}
}