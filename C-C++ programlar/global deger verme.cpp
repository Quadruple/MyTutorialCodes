#include<stdio.h>
int s1=5 , s2=10 , toplam=0 ;
int calculate()
{
	toplam=s1+s2 ;
	printf("\n fonksiyon toplamý=%d" , toplam) ;
}
int main()
{
	toplam=s1+s2 ;
	printf("toplam=%d" , toplam) ;
    calculate() ;
    return 0;
}

