package com.ahmete.ODEV;
/*
Soru 9. Kullanıcıdan bir sayı alın ve bu sayının basamaklarını tersine çevirin. (While)
 */

import java.util.Scanner;

public class soru9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen tersini almak istediğiniz sayiyi giriniz");
		int sayi=scanner.nextInt();
				int n,tersi;
		n=0;
		tersi=0;
		
		while (sayi!=0){
			
			n=sayi%10;
			sayi=sayi/10;
			tersi=n+tersi*10;
		}
		System.out.println("sonuc: "+tersi);
		
	}
}