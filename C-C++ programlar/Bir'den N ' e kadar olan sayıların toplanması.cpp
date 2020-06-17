// Bir ' den N ' e Kadar olan Sayýlarýn Toplamý
#include<stdio.h>
int main() {
	int n , a = 0 , top = 0 ;
	oku_n :
	printf("Hangi Sayiya Kadar Olan Sayilarin Toplanmasini Istiyorsunuz ?\n") ;
	scanf("%d" , &n) ;
	if (n<0) {
		printf("Girdiginiz Sayi Hatali !\n") ;
		goto oku_n ;
	}
	Sayac_Devam_Ettir :
	a = a + 1 ;
	top = top + a ;
	if (a<n) {
		goto Sayac_Devam_Ettir ;
	}
	printf("Istediginiz Degere Kadar Olan Sayilarin Toplami :") ;
	printf("%d" , top) ;
	getchar() ;
	return 0 ;
}
