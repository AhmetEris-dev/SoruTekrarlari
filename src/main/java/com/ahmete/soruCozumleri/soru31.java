package com.ahmete.soruCozumleri;

import java.util.Scanner;

public class soru31 {
	/*
	İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım. Uygulama kullanıcı çıkış yapmadıgı sürece çalışmaya devam edecek. 4 işlem için metotlardan faydalanalım.
	 */
	public static void main(String[] args) {
	menu();
	}
	public static void menu(){
		Scanner scanner=new Scanner(System.in);
		int secim;
		boolean menu=true;
		while (menu){
			System.out.println("\n--------HESAP MAKİNESİ-------");
			System.out.println("1--Toplama işlemi");
			System.out.println("2--Cıkarma işlemi");
			System.out.println("3--Carpma işlemi");
			System.out.println("4--Bölme  işlemi");
			System.out.println("0--Cıkış yap");
			System.out.print("lütfen yapmak istediğiniz işlemi seciniz: ");
			secim=scanner.nextInt();scanner.nextLine();
			switch (secim){
				case 0: {
					menu=false;
					System.out.println("Hesap makinesinden cıkılıyor...");
					break;
				}
				case  1:{
					System.out.println("\n-----TOPLAMA İŞLEMİ------");
					System.out.println("lütfen toplamak istediğiniz birinci sayiyi giriniz");
					int sayi1=scanner.nextInt();
					System.out.println("lütfen toplamak istediğiniz ikinci sayiyi giriniz");
					int sayi2=scanner.nextInt();
					System.out.println("sonuc: "+topla(sayi1,sayi2));
					break;
				}
				case 2:{
					System.out.println("\n--------CIKARMA İŞLEMİ------");
					int sonuc=ikiSayiyiCikart();
					break;
				}
				case 3:{
					System.out.println("\n-------CARPMA İŞLEMİ-------");
					int sonuc=ikiSayiyiCarp();
					break;
				}
				case 4:{
					System.out.println("\n------BÖLME İŞLEMİ-------");
					double sonuc=ikiSayiyiBol();
					break;
				}
				default:{
					System.out.println("\nlütfen doğru seceneği seciniz!!!");
					break;
				}
				
			}
		}
	}
	private static int topla(int sayi1,int sayi2){
		
		int toplam=sayi1+sayi2;
		return toplam;
	}
	private static int ikiSayiyiCikart(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen cıkartmak istediğiniz birinci sayiyi giriniz");
		int sayi1=scanner.nextInt();
		System.out.println("lütfen cıkartmak istediğiniz ikinci sayiyi giriniz");
		int sayi2=scanner.nextInt();
		int sonuc=sayi1-sayi2;
		System.out.println("sonuc: "+sonuc);
		return sonuc;
		
	}
	private static int ikiSayiyiCarp(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen carpmak istediğiniz birinci sayiyi giriniz");
		int sayi1=scanner.nextInt();
		System.out.println("lütfen carpmak istediğiniz ikinci sayiyi giriniz");
		int sayi2=scanner.nextInt();
		int sonuc=sayi1*sayi2;
		System.out.println("sonuc: "+sonuc);
		return sonuc;
	}
	private static double ikiSayiyiBol(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bölmek istediğiniz birinci sayiyi giriniz");
		int sayi1=scanner.nextInt();
		System.out.println("lütfen bölmek istediğiniz ikinci sayiyi giriniz");
		int sayi2=scanner.nextInt();
		double sonuc=((double) sayi1)/sayi2;
		System.out.println("sonuc: "+sonuc);
		return sonuc;
	}
}