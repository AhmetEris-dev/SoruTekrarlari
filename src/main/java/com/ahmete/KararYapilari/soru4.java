package com.ahmete.KararYapilari;
/*
Kullanıcının girdiği not bilgisine göre(Scanner) harf notu hesaplayan bir program yazmanız gerekiyor.
 90 ve üzeri AA,
 80-89 arası BA,
 70-79 arası BB,
 60-69 arası CB,
 50-59 arası CC,
 40-49 arası DC,
 30-39 arası DD,
 0-29 arası FF olarak belirlenmiştir.
 
 Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.
 */

import java.util.Scanner;

public class soru4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen notunuzu giriniz");
		int not = scanner.nextInt();
		
		if (not > 100) {
			System.out.println("notunuz 100 den yüksek olamaz.Lütfen gecerli bir not giriniz");
		}
		else if (not >= 90) {
			System.out.println("AA");
			
		}
		else if (not >= 80) {
			System.out.println("BA");
			
		}
		else if (not >= 70) {
			System.out.println("BB");
			
		}
		else if (not >= 60) {
			System.out.println("CB");
			
		}
		else if (not >= 50) {
			System.out.println("CC");
			
		}
		else if (not >= 40) {
			System.out.println("DC");
			
		}
		else if (not >= 30) {
			System.out.println("DD");
			
		}
		else if (not >= 0) {
			System.out.println("FF");
			
		}
		else {
			System.out.println("notunuz 0 dan kücük olamaz");
		}
	}
}