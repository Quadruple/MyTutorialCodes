// Bilgisayardan X adet rastgele sayi alma
#include<stdio.h>
#include<stdlib.h>
int main () {
	int a , b , i ;
	printf ("Bilgisayardan kac adet rastgele sayi almak istediginizi giriniz :") ;
	scanf ("%d" , &a) ;
	for (i=0 ; i<a ; i++) {
		atakan :
		b = rand() ;
		if (b>100) {
			goto atakan ;
		}
		else if (b<0) {
			goto atakan ;
		}
		else {
			printf ("%d\n" , b) ;
		}
	}
	getchar () ;
	return 0 ;
}
