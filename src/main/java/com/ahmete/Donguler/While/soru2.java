package com.ahmete.Donguler.While;
/*
Kullanıcıdan alınan sayının faktöryelini bulan programı while kullanarak yazınız.
5! = 5*4*3*2*1 = 120
4! = 4*3*2*1 =24
3! = 3*2*1 =6
 */

import java.util.Scanner;

public class soru2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen faktoriyelini almak istediğiniz sayiyi giriniz");
		int sayi=scanner.nextInt();
		int faktoriyel=1;
		while (sayi>0){
			if (sayi==1){
				System.out.print(sayi);
			}else {
				System.out.print(sayi+"*");
			}
			faktoriyel*=sayi;
			sayi--;
		}
		System.out.println("="+faktoriyel);
		
	}
}