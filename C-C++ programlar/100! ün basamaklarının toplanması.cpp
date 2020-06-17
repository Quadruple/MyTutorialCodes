//100! factoriyelin basamaklarýnýn toplanmasý
#include<stdio.h>
int main () {
	long long int a , b=1 ;
	printf ("Hangi sayinin faktoriyelini almak istiyorsunuz :") ;
	scanf("%lli" , &a) ;
	for (; a>=1 ; a-- ) {
		b = b * a ;
	}
	printf ("%lli! = %lli" , a , b) ;
}
