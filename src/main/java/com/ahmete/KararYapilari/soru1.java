package com.ahmete.KararYapilari;
/*
        Bir program yazmanız gerekiyor ve kullanıcıların yaşlarına göre mesaj alacaklar.
        18 yaş altı kullanıcılara "Bu içeriğe erişim izniniz yok."
        18-30 yaş aralığındaki kullanıcılara "İçeriği görüntülemek için yaşınız yeterli."
        30 yaş üstü kullanıcılara "Bu içerik sizin yaş grubunuza yönelik değildir." mesajı gösterilmelidir.
        (yas değişken değerini 25 vererek deneyebilirsiniz.)
     */

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen yasınızı giriniz");
		int yas=scanner.nextInt();
		
		
		if (yas<18 && yas>0){
			System.out.println("Bu içeriğe erişim izniniz yok");
		}
		else if (yas>18 && yas<30) {
			System.out.println("İçeriği görüntülemek için yaşınız yeterli");
			
		}
		else if (yas>30) {
			System.out.println("bu içerik sizin yas grubunuza yönelik değildir");
			
		}else {
			System.out.println("lütfen yasinizi giriniz");
		}
	}
}