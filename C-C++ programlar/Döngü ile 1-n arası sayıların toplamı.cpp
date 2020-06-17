// Döngü ile 1-n arasý sayýlarýn toplanmasý
#include<stdio.h> 
int main () {
	int s , n , toplam=0 ;
	printf("Toplanmasini istediginiz en son sayiyi girin :") ;
	scanf("%d" , &n) ;
	if (n==1) {
		printf("Toplam = 1 ") ;
	}
	else {
		for (s=1 ; s<=n ; s++) 
		toplam = toplam + s ;
	}
	printf ("Toplam=%d" , toplam) ;
	getchar () ;
	return 0 ;
}
