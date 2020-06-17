#include<stdio.h>
#define pi 3.14
int main()
{
	double r , alan , cevre ;
	printf("yaricapi giriniz") ;
	scanf("%lf" , &r) ;
	alan=pi*r*r ;
	cevre=2*pi*r ;
	printf("r=%lf alan=%lf cevre=%lf" , r , alan , cevre) ;
	getchar() ;
	return 0 ;
}
