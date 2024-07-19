package com.ahmete.soruCozumleri;
/*
1'den 100'e kadar olan çift sayıların toplamının,
     tek sayıların toplamına olan oranını bulan program.
 */

public class soru15 {
	public static void main(String[] args) {
		int toplamCift=0;
		int toplamTek=0;
		for (int i = 1; i <=100 ; i++) {
			if (i%2==0){
				toplamCift+=i;
			}
			else if (i%2==1) {
				toplamTek+=i;
			}
		}
		System.out.println(toplamCift/toplamTek);
	}
}