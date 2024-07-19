package com.ahmete.ODEV;
/*
Soru 1. Kullanıcıdan bir üçgenin üç kenar uzunluğunu girmesini isteyin ve bu üçgenin eşkenar, ikizkenar veya
çeşitkenar olduğunu belirleyin. (if-else if-else)
 */

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ücgenin birinci kenar uzunlugunuz giriniz");
		int kenar1 = scanner.nextInt();
		System.out.println("Ücgenin ikinci kenar uzunlugunuz giriniz");
		int kenar2 = scanner.nextInt();
		System.out.println("Ücgenin ucuncu kenar uzunlugunuz giriniz");
		int kenar3 = scanner.nextInt();
		
		if (kenar1 == kenar2 && kenar2 == kenar3) {
			System.out.println("Girmiş oldugunuz kenar uzunluklarına göre eşkenar üçgendir.");
		}
		else if ((kenar1 == kenar2 && kenar2 != kenar3) || (kenar1 == kenar3 && kenar1 != kenar2) || (kenar2 == kenar3 && kenar3 != kenar1)) {
			System.out.println("Girmiş oldugunuz kenar uzunluklarına göre ikizkenar üçgendir");
			
		}
		else if (kenar1 != kenar2 && kenar2 != kenar3) {
			System.out.println("Girmiş oldugunuz kenar uzunluklarına göre çeşitkenar üçgendir");
			
		}
	}
}