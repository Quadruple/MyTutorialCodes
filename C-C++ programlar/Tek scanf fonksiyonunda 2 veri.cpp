#include<stdio.h>
int main()
{
	int s1 , s2 , toplam ;
	printf("sayilari giriniz") ;
	scanf("%d%d" , &s1 , &s2 ) ;
	toplam=s1+s2 ;
	printf("%d ile %d toplamý=%d" , s1 , s2 , toplam) ;
	getchar() ;
	return 0 ;
}
