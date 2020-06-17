// Faktöriyel Hesabý
#include<stdio.h>
int main () {
	int a , n = 0 , f = 1 ;
	oku_faktoriyel :
	printf ("Hangi Sayinin Faktoriyelini Hesaplamak Istiyorsunuz ?") ;
	scanf ("%d" , &a) ;
	if (a<0) {
		printf ("Girdiginiz Degerin Faktoriyeli Hesaplanamaz !") ;
		goto oku_faktoriyel ;
	}
	sayac_devam_ettir :
	n = n + 1 ;
	f = f * n ;
	if (n<a) {
		goto sayac_devam_ettir ;
	}
	printf("Girdiginiz Degerin Faktoriyeli :") ;
	printf("%d" , f) ;
	getchar() ;
	return 0 ;
}
