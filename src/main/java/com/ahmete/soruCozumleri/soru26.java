package com.ahmete.soruCozumleri;

/*
4- Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.
-> 2, -256, 2, 1258, 2, 2
 */
public class soru26 {
	public static void main(String[] args) {
		int[] sayilar={2, -256, 2, 1258, 2, 2};
		boolean tekrarVarMI=false;
		
		for (int i = 0; i < sayilar.length-1 ; i++) {
			if (sayilar[i]==2 && sayilar[i+1]==2){
				tekrarVarMI=true;
				break;
			}
			
		}
		System.out.println(tekrarVarMI);
	}
}