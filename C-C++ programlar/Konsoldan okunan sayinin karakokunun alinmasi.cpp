// Konsoldan alinan sayinin karekokunun alinmasi
#include<stdio.h>
#include<math.h>
int main () {
	double a , b ;
	printf ("Karekokunu almak istediginiz sayiyi giriniz :") ;
	scanf ("%lf" , &a) ;
	printf ("%f" , sqrt(a)) ;
	getchar () ;
	return 0 ;
}

