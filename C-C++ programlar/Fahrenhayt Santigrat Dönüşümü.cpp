//Fahrenhayt Santigrat Dönüþümü
#include<stdio.h>
#define oran 1.8
int main()
{
	int f ;
	double c ;
	printf("Fahrenhayt:") ;    scanf("%d" , &f) ;
	c=(double) (f-32) / oran ; 
	printf("c=%lf" , c) ;
	getchar() ;
	return 0 ;
}
