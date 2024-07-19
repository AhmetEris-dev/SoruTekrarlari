package com.ahmete.soruCozumleri;
/*
"Java,React,Spring" String degerinden bir for döngüsü içerisinde Java React ve Spring i ayrı ayrı yazdıralım.
 */

public class soru22 {
	public static void main(String[] args) {
		String kelimeler="Java,React,Spring";
		int index=0;
		for (int i = 0; i <kelimeler.length() ; i++) {
			if (kelimeler.charAt(i)==','){
				System.out.println(kelimeler.substring(index,i));
				index=i+1;
			}
			
		}
		System.out.println(kelimeler.substring(index));
	}
}