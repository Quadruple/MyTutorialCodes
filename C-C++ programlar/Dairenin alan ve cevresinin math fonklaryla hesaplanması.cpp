// Dairenin alan ve cevresinin math fonksiyonlarıyla hesaplanması
#include<stdio.h>
#include<math.h>
#define pi 3
int main () {
	double r , cevre , alan ;
	printf ("Darirenizin yaricapini giriniz :") ;
	scanf ("%lf" , &r) ;
	cevre = 2 * pi * r ;
	alan = pi * pow (r , 2) ;
	printf ("%f %f" , cevre , alan) ;
	getchar () ;
	return 0 ;
}
