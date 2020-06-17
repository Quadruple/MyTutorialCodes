// N adet sayinin ortalamasý
#include<stdio.h>
int main () {
	int s , n , a , toplam , ortalama ;
	printf ("Kac sayinin ortalamasini almak istediginizi girin :") ;
	scanf ("%d" , &s) ;
	for (n=1 ; n<=s ; n++) {
		printf("%d. sayiyi girin :" , n) ;
		scanf ("%d" , &a) ;
		toplam = toplam + a ;
	}
	ortalama = toplam / s ;
	printf ("Istediginiz ortalama = %d" , ortalama) ;
	getchar () ;
	return 0 ;
}
