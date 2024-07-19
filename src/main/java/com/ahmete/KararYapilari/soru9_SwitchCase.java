package com.ahmete.KararYapilari;
/*
Kullanıcının girdiği not bilgisine göre(Scanner) harf notu hesaplayan bir program yazmanız gerekiyor.
95 -> 9 ? 99/10=9
 90 ve üzeri AA,    9,10
 80-89 arası BA,    8
 70-79 arası BB,    7
 60-69 arası CB,    6
 50-59 arası CC,    5
 40-49 arası DC,    4
 30-39 arası DD,    3
 0-29 arası FF      0,1,2
 
 olarak belirlenmiştir.
 
 Bu durumda switch-case yapısı kullanarak bir program yazınız.
 */

import java.util.Scanner;

public class soru9_SwitchCase {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen notunuzu giriniz");
		int not=scanner.nextInt();
		String harfNotu ;
		
		if (not<0 || not>100){
			System.out.println("lütfen 0 ile 100 arasında bir değer giriniz");
		}
		else {
			harfNotu= switch (not / 10){
				case 9,10-> "AA";
				case 8 -> "AB";
				case 7 -> "BB";
				case 6 -> "BC";
				case 5 -> "CC";
				case 4 -> "CD";
				case 3 -> "DD";
				default ->  "FF";
				
				
			};
			System.out.println(not+" için harf notunuz "+harfNotu);
		}
		
		
		
	}
}