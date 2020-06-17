// Topla fonksiyonu
#include<stdio.h>
double topla (double x , double y) {
	double top ;
	top = x + y ;
	printf("%lf" , top) ;
	return top ;
}
int main () {
	double a , b ;
	printf ("Toplama isleminin ilk sayisi :\n") ;
	scanf ("%lf" , &a) ;
	printf ("Toplama isleminin ikinci sayisi :\n") ;
	scanf ("%lf" , &b) ;
	topla (a , b) ;
	getchar () ;
	return 0 ;
}
