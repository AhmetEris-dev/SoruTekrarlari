package com.ahmete.soruCozumleri;
/*
Bir program oluşturacağız. Kullanıcıyı önce konsolda karşılayıp, sonrasında kullanıcıya hangi dilde devam etmek
	istersiniz diye soracağız.

Karşılama menüsü aşağıdaki gibidir;
Hoşgeldiniz! / Welcome!
Lutfen goruntuleme dilini seciniz. / Please select display language.

1-- Turkish (TR)
2-- English (EN)

Kullanıcının vereceği cevaba göre bizi 2 farlı menü karşılayabilecek.

Menü'nün Türkçe versiyonundaki işlevler aşağıdaki gibidir;
0 -- Çıkış Yap
1--  Merhaba Dünya yazdır.
2-- Faktoriyel Hesapla.
3-- Asal sayı kontrolü yap.

Kullanıcı çıkış yapmadığı sürece menü'de kalacak ve menü işlevlerini kullanmaya devam edebilecek. Çıkış yapmaya karar
 vermesi durumunda;

Program sonlandırılmıştır! Gorusmek uzere! gibi bir çıktı verip bitirebilirsiniz.
Çalışmam
 */

import java.util.Scanner;

public class soru18 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hoşgeldiniz! / Welcome!");
		System.out.println("1-- Turkish (TR)");
		System.out.println("2-- English (EN)");;
		System.out.println("Lutfen goruntuleme dilini seciniz. / Please select display language.");
		int dilSecenegi=scanner.nextInt();scanner.nextLine();
		boolean menu = true;
		while (menu){
			System.out.println("\n---------MENU----------");
			System.out.println("1--Merhaba dünya yazdır");
			System.out.println("2--Faktoriyel hesapla");
			System.out.println("3-- Asal sayı kontrolü");
			System.out.println("0 -- Çıkış Yap");
			System.out.print("lütfen yapmak istediğiniz işlemi seciniz");
			int secim=scanner.nextInt();scanner.nextLine();
			switch (secim){
				case 1:{
					System.out.println("\nMERHABA DÜNYA !!!");
					break;
				}
				case 2:{
					System.out.println("\n---------FAKTORİYEL HESAPLAMA-------");
					System.out.print("\nlütfen faktoriyelini hesaplamak istediğiniz sayiyi giriniz");
					int sayi=scanner.nextInt();
					int faktoriyel=1;
					for (int i = 1; i <=sayi; i++) {
						faktoriyel*=i;
						
					}
					System.out.println(sayi+" faktoriyeli= "+faktoriyel);
					break;
				}
				case 3:{
					System.out.println("\n---------ASAL SAYI KONTROLU--------");
					System.out.print("\nasal sayı kontrolu yapmak istediğiniz sayiyi giriniz");
					int sayi=scanner.nextInt();
					int sayac=0;
					for (int i = 1; i <=sayi ; i++) {
						if (sayi%i==0){
							sayac++;
						}
					}
					if (sayac>2){
						System.out.println(sayi+" sayısı asal sayı değildir");
					}else {
						System.out.println(sayi+" sayısı asaldır.");
					}
					break;
				}
				case 0:{
					menu=false;
					System.out.println("\nProgram sonlaıdırılıyor....");
					break;
				}
				default:{
					System.out.println("lütfen gecerli bir secim yapınız");
				}
				
				
			}
			
		}
		
		
		
		
		
		
		
	}
}