//Dairede hem çevre hem alan hesaplama ve sabit atama
#include<stdio.h>
#define pi 3.14
int main()
{
	double r=3 , alan=0 , cevre=0 ;
	alan = pi*r*r ;
	cevre = 2*pi*r ;
	printf("%lf\n" , alan) ;
	printf("%lf\n" , cevre) ;
	getchar() ;
	return 0 ;
}
