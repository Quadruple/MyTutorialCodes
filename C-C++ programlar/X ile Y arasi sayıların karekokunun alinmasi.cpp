// X ile Y arasi sayilarin karekokunu alan program 
#include<stdio.h>
#include<math.h>
int main () {
	double a , b , c ;
	printf ("Karekokunu almak istediginiz araligin ilk degerini giriniz :") ;
	scanf ("%lf" , &a) ;
	printf ("Karekokunu almak istediginiz sayinin ikinci degerini giriniz :") ;
	scanf ("%lf" , &b) ;
	for (; a<b ; a++) {
		c = sqrt(a) ;
		printf ("%f %f\n" , a , c) ;
	}
	getchar () ;
	return 0 ;
}
