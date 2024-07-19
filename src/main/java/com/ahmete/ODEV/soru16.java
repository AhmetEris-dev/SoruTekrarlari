package com.ahmete.ODEV;

/*
Soru 16. İki tamsayı değişkeni tanımlayın ve bu değişkenlerin toplamını, farkını, çarpımını ve bölümünü ekrana
yazdırın. (Değişkenler-Operatörler)
 */
public class soru16 {
	public static void main(String[] args) {
		int sayi1, sayi2;
		sayi1 = 20;
		sayi2 = 10;
		
		System.out.println("----------toplama işlemi----------");
		int toplama = 0;
		toplama = sayi1 + sayi2;
		System.out.println(toplama);
		
		
		System.out.println("-----------cıkarma işlemi-----------");
		int cikarma = 0;
		cikarma = sayi1 - sayi2;
		System.out.println(cikarma);
		
		System.out.println("------------------carpma işlemi-------------");
		int carpma = 0;
		carpma = sayi1 * sayi2;
		System.out.println(carpma);
		
		
		System.out.println("--------------bölme işlemi-----------");
		int bolme = 0;
		bolme = sayi1 / sayi2;
		System.out.println(bolme);
		
	}
}