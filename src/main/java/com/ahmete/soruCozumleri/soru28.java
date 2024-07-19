package com.ahmete.soruCozumleri;
/*
 Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti
    4 sayısının adetinden büyükse true değilse false yazdıralım.
    -> 1,4,5,6,1,1,4,8
 */

public class soru28 {
	public static void main(String[] args) {
		int [] sayilar={1,4,5,6,1,1,4,8};
		boolean tekrarVarMi=false;
		int birSayac=0;
		int dortSayac=0;
		
		for (int i = 0; i <sayilar.length ; i++) {
			if (sayilar[i]==1){
				birSayac++;
			}
			else if (sayilar[i]==4) {
				dortSayac++;
				
			}
		}
		tekrarVarMi=birSayac>dortSayac;
		System.out.println(tekrarVarMi);
	}
}