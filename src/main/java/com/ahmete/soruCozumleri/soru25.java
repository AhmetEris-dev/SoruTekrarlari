package com.ahmete.soruCozumleri;

public class soru25 {
	/*
	3- Dizideki en buyuk 2. sayiyi bulalim.
-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
	 */
	public static void main(String[] args) {
		int[] sayiArr={120, 130, 125, -256, 16, 1300, 1258, 81, 14};
		int max=Integer.MIN_VALUE;
		int ikinciMax=Integer.MIN_VALUE;
		for (int i = 0; i <sayiArr.length ; i++) {
			if (sayiArr[i]>max){
				max=sayiArr[i];
			}
		}
		for (int i = 0; i <sayiArr.length ; i++) {
			if (sayiArr[i]<max && sayiArr[i]>ikinciMax){
				ikinciMax=sayiArr[i];
			}
			
		}
		System.out.println("ikinci en buyuk sayi: "+ikinciMax);
	}
}