// Acisi verilen daire diliminin alanýnýn hesaplanmasý
#include<stdio.h>
#include<math.h>
#define pi 3.14
int main () {
	int a ;
	double b , A ;
	printf ("Dairenizin acisi kac derece :") ;
	scanf ("%d" , &a) ;
	printf ("Dairenizin yaricapini giriniz :") ;
	scanf ("%lf" , &b) ;
	A = a * pi * b * b / 360 ;
	printf ("Dairenizin alani = %f" , A) ;
	return 0 ;
	getchar() ;
}
