//Tek bilinmeyenli denklem ��z�m� (ax+b=0 denkleminde x bilinmeyen a ve b klavye giri�li terimdir)
#include<stdio.h>
int main()
{
	double x , a , b ;
	printf("a ve b degerlerini giriniz:") ;
    scanf("%lf %lf" , &a , &b) ;
    x=-b/a ;
    printf("x=%lf" , x) ;
    getchar() ;
    return 0 ;
}
