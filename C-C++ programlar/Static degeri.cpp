#include<stdio.h>
static int s1 , s2 , toplam=0 ;
int hesapla()
{
	toplam=s1+s2 ;
	printf("\n fonksiyon toplamý=%d" , toplam) ;
	getchar() ;
	return 0 ;
}
int main()
{
	s1=10 ;
	s2=20 ;
	toplam=s1+s2 ;
	printf("toplam=%d" , toplam) ;
	getchar() ;
	return 0 ;
}
