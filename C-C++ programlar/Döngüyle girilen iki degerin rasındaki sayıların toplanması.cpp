// Döngüyle girilen 2 sayý arasýndaki sayýlarýn toplamý
#include<stdio.h>
int main () {
	int a1 , a2 , toplam ;
	printf("Toplanmasini istediginiz araligin ilk degerini giriniz :") ;
	scanf ("%d" , &a1) ;
	printf("Toplanmasini istediginiz araligin son degerini giriniz :") ;
	scanf ("%d" , &a2) ;
	for (; a1<=a2 ; a1++) 
		toplam = toplam + a1 ;
	printf ("Istediginiz araliktaki sayilarin toplami=%d" , toplam) ;
	getchar() ;
	return 0 ;
}
