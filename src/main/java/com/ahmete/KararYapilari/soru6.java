package com.ahmete.KararYapilari;
/*
Kullanıcının girdiği sayının
pozitif,
negatif veya
sıfır olduğunu belirleyen bir program yazmanız gerekiyor.
 Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz
 */

import java.util.Scanner;

public class soru6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir sayi giriniz");
		double sayi=scanner.nextDouble();
		
		if (sayi==0){
			System.out.println("girdiğiniz sayi sıfırdır.");
		}
		else if (sayi<0) {
			System.out.println("girdiğiniz sayi negatiftir.");
		}
		else if (sayi>0) {
			System.out.println("girdiğiniz sayi pozitiftir.");
		}
	}
}