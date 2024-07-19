package com.ahmete.soruCozumleri;
/*
En büyük ve en küçük sayiyi tespit edelim.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */

public class soru24_day02_soru2 {
	public static void main(String[] args) {
		int[]  diziArr={ 0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int max=diziArr[0];
		for (int i = 0; i <diziArr.length ; i++) {
			if (diziArr[i]>max){
				max=diziArr[i];
			}
			
		}
		System.out.println("en buyuk sayi: "+max);
		
		
		int min=diziArr[0];
		for (int i = 0; i <diziArr.length ; i++) {
			if (diziArr[i]<min){
				min=diziArr[i];
			}
			
		}
		System.out.println("en kucuk sayi: "+min);
	}
	
}