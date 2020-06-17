// Uçgen alanýnýn hesaplanmasý
#include<stdio.h>
int main () {
	double a , b , alan ;
	printf ("Ucgenin tabani :") ;
	scanf("%lf" , &a) ;
	printf("Ucgenin yuksekligi :") ;
	scanf ("%lf" , &b) ;
	alan = a*b / 2 ;
	printf("Ucgenin alani = %f" , alan) ;
	return 0 ;
	getchar () ;
}
