// Ucgen alan�n�n sin�s form�l�yle bulunmas�
#include<math.h>
#include<stdio.h>
#define pi 3.14
int main () {
	double a , b , aci , radyan , alan ;
	printf ("Ucgenin ac�ya bagli birinci kenar uzunlugu :") ;
	scanf("%lf" , &a) ;
	printf("Ucgenin ac�ya bagli ikinci kenar uzunlugu :") ;
	scanf("%lf" , &b) ;
	printf("Ucgenin kenarlardaki birlesimindeki aci :") ;
	scanf("%lf" , &aci) ;
	radyan = aci*pi/180 ;
	printf("Radyan = %f\n" , radyan) ;
	alan = sin(radyan) * a * b / 2 ;
	printf("Ucgeninizin alan� = %f" , alan) ;
	return 0 ;
	getchar () ;
}
