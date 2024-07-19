package com.ahmete.soruCozumleri;

import java.util.Scanner;
/*
7- Girilen sayının 5'in kuvveti olup olmadığını bulan program.
 */

public class soru17 {public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("5 in kuvveti olup olmadığını bulmak istediğiniz sayiyi giriniz");
	int sayi=scanner.nextInt();
	
	if (sayi%5==0){
		System.out.println(sayi+"sayi 5 in katıdır");
	}else {
		System.out.println(sayi+" ayi 5 in katı değildir");
	}
}
}