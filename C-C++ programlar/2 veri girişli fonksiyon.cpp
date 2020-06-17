#include<stdio.h>
int main()
{
	int s1 , s2 , toplam ;
	printf("ilk tamsayi:") ; scanf("%d" , &s1) ;
	printf("ikinci tamsayi:") ; scanf("%d" , &s2) ;
	toplam=s1+s2 ;
	printf("%d ile %d toplami=%d" , s1 , s2 , toplam) ;
	getchar() ;
	return 0 ;
}
