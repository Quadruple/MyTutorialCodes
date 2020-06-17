// Belirlenmiþ iki deger arasindaki sayilari yazdýrma 
#include<stdio.h>
int main () {
	int s , n ;
	printf ("Araligin baslangic degerini girin :") ;
	scanf ("%d" , &s) ;
	printf("Araligin son degerini girin :") ;
	scanf ("%d" , &n) ;
	printf("Araliktaki sayilar :") ;
	for (; s<=n ; s++) 
		printf("%d\n" , s) ;
	getchar () ;
	return 0 ;
}
