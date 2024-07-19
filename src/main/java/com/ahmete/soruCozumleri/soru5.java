package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru5 {
	
	/*
	 *  dairenin alanını ve cevresini bulalım (cap yada yarıcap input olarak gelsin)
	 */
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double PI=Math.PI;
		System.out.println("dairenin capını giriniz");
		int cap=scanner.nextInt();
		double daireninAlani,daireninCevresi;
		daireninAlani=PI*(cap/2);
		daireninCevresi=2*PI*cap/2;
		
		System.out.println("dairenin alanı= "+daireninAlani+"\ndairenin cevresi= "+daireninCevresi);
		
	}
}