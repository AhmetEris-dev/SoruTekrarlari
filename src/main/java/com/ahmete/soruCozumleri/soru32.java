package com.ahmete.soruCozumleri;
/*
2- Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
    başka bir diziye atsın ve o diziyi yazdırsın.
 */

public class soru32 {
	public static void main(String[] args) {
	int [] tekSayiArr={1,2,3,4,5,6,7,8,9,10,12,14,15,21,84,9563};
	tekSayilariBulArray(tekSayiArr);
	}
	public static int[] tekSayilariBulArray(int[] sayiArr){
		int[] tekSayiArr=new int[tekSayilarinSayisiniBul(sayiArr)];
		int i=0;
		for (int sayi:sayiArr){
			if (sayi%2!=0){
				tekSayiArr[i]=sayi;
				i++;
			}
		
		}
		printArray(tekSayiArr);
		return tekSayiArr;
	}
	public static int tekSayilarinSayisiniBul(int[] sayiArr){
		int tekSayi=0;
		for (int sayi:sayiArr){
			if (sayi%2!=0){
				tekSayi++;
			}
		
		}
		return tekSayi;
	
	}
	public static void printArray(int[] sayiArr){
		for (int sayi:sayiArr){
			System.out.print(sayi+",");
		}
	}
}