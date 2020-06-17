// Sayac Kullanýmý (AMAÇ ???)
#include<stdio.h>
int main() {
	int sayi , sayac = 0 ;
	oku :
	printf("sayi :") ;
	scanf("%d" , &sayi) ;
	sayac = sayac + 1 ;
	if (sayi==5) {
		printf("sayac=%d" , sayac) ;
	}
	else {
		goto oku ;
	}
	getchar() ;
	return 0 ;
}
