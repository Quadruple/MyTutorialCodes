// Inch-Santimetre dönüþümü
#include<stdio.h>
#define oran  2.54
int main()
{
	double i , cm ;
	printf("inch:") ;   scanf("%lf" , &i) ;
	cm=oran * i ;
	printf("inch=%f cm=%f" , i , cm) ;
    getchar() ;
    return 0 ;
}
