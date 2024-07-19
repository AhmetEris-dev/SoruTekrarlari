package com.ahmete.Donguler.While;
/*
Kullanıcıdan alınan kelime ile kelimenin tersten yazılışı aynı ise: "Polindrom", değilse "Polindrom Değil" yazdıran
programı yazın
 */



import java.util.Scanner;

public class soru4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String kelime=scanner.nextLine();
		String kelimeters="";
		
		int uzunluk=kelime.length();
		int index= uzunluk-1;
		
		while (index>=0){
			kelimeters +=kelime.charAt(index);
			index--;
		}
		System.out.println(kelimeters);
		
		if (kelime.equalsIgnoreCase(kelimeters)){
			System.out.println("polindrumdor");
		}else{
			System.out.println("polindrum değilir");
		}
	}
	
}