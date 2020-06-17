//Girilen acinin sinüs ve kosinüsünü bulan program
#include<stdio.h>
#include<math.h>
#define pi 3
int main () {
	double a , b , c , d ;
	printf ("Sinus ve kosinus degerini istediginiz acinin kac derece oldugunu giriniz : ") ;
	scanf ("%lf" , &a) ;
	b = a * pi / 180 ;
	c = sin(b) ;
	d = cos(b) ;
	printf ("%lf derece acinin sinusu = %lf\n" , a , c) ;
	printf ("%lf derece acinin kosinusu = %lf" , a , d) ;
	getchar () ;
	return 0 ;
}
