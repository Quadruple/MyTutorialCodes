// Bir sayinin N. Kuvveti
#include<stdio.h>
#include<math.h>
int main () {
	double a , b ;
	printf ("Uslu sayinizin tabani : ") ;
	scanf ("%lf" , &a) ;
	printf ("Uslu sayinizin kuvveti : ") ;
	scanf ("%lf" , &b) ;
	printf ("%f ^ %f = %f" , a , b , pow(a , b)) ;
	getchar () ;
	return 0 ;
}
