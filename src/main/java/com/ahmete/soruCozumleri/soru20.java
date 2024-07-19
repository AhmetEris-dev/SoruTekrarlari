package com.ahmete.soruCozumleri;
/*
Dışarıdan bir string girdisi alalım. Bu stringin her bir harfini, bulunduğu index ile birlikte alt alta
	yazdıracağım.
 */

import java.util.Scanner;

public class soru20 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir kelime giriniz");
		String kelime=scanner.nextLine();
		for (int i = 0; i <kelime.length() ; i++) {
			char ch=kelime.charAt(i);
			System.out.println(ch+"  "+i);
		}
	}
}