#include<stdio.h>
int s1 , s2 , toplam=0 ;
int hesapla()
{
	s1=100 ;
	s2=200 ;
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
	hesapla() ;
	getchar() ;
	return 0 ;
}

