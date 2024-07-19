package com.ahmete.ODEV;
/*
Soru 10. Kullanıcıdan bir cümle alın ve bu cümledeki kelimeleri tek tek ekrana yazdırın. (String fonksiyonları)
 */

import java.util.Scanner;

public class soru10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir cümle giriniz");
		String cumle=scanner.nextLine();
		int index=0;
		
		
		for (int i = 0; i <cumle.length() ; i++) {
			if (cumle.charAt(i)==' '){
				System.out.println(cumle.substring(index,i));
				index=i+1;
			}
		}
		System.out.println(cumle.substring(index));
	}
}