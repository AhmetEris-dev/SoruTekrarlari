package com.ahmete.soruCozumleri;
/*
6- Telefon kodu ve Email kodumuz olsun (Numerik ve bunları elle girebiliriz)
     Sonrasında kullanıcıdan kodları girmesini isteyeceğiz, e-mail kodu hatalıysa ona
     göre bir mesaj, sms kodu hatalıysa ona göre bir mesaj, ikisi de doğru girildiğinde
     de "Başarıyla giriş yaptınız".
 */

import java.util.Scanner;

public class soru16 {
	public static void main(String[] args) {
		int telefonKodu=1234;
		int mailKodu=4321;
		Scanner scanner=new Scanner(System.in);
		System.out.print("lütfen telefon kodunuzu giriniz");
		  int inputTelefonKodu=scanner.nextInt();
		System.out.print("lütfen email kodunuzu giriniz");
		int inputEmailKodu=scanner.nextInt();
		if (telefonKodu==inputTelefonKodu && mailKodu==inputEmailKodu){
			System.out.println("başarıyla giriş yaptınız");
		}
		else if (telefonKodu!=inputTelefonKodu && mailKodu==inputEmailKodu) {
			System.out.println("girmiş oldugunuz telefon kodu hatalıdır!!!");
		}
		else if (telefonKodu==inputTelefonKodu && mailKodu!=inputEmailKodu) {
			System.out.println("girmiş oldugunuz mail kodu hatalıdır!!!");
		}else {
			System.out.println("girmiş oldugunuz telefon ve mail kodunuz yanlıştır!!!");
		}
	}
}