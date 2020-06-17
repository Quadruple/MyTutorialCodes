// Ucgen alanýnýn sinüs formülüyle bulunmasý
#include<math.h>
#include<stdio.h>
#define pi 3.14
int main () {
	double a , b , aci , radyan , alan ;
	printf ("Ucgenin acýya bagli birinci kenar uzunlugu :") ;
	scanf("%lf" , &a) ;
	printf("Ucgenin acýya bagli ikinci kenar uzunlugu :") ;
	scanf("%lf" , &b) ;
	printf("Ucgenin kenarlardaki birlesimindeki aci :") ;
	scanf("%lf" , &aci) ;
	radyan = aci*pi/180 ;
	printf("Radyan = %f\n" , radyan) ;
	alan = sin(radyan) * a * b / 2 ;
	printf("Ucgeninizin alaný = %f" , alan) ;
	return 0 ;
	getchar () ;
}
