// Konsoldan Girilen Sayilardan En Buyuk Olaný Bulan Program
#include<stdio.h>
int main () {
	int a , b=0 , c , e=0 ;
	printf("Kac adet sayi girmek istediginizi belirtin :") ;
	scanf("%d" , &a) ;
	for (b=1 ; b<a+1 ; b++) {
		printf("%d. sayiyi giriniz :" , b) ;
		scanf("%d" , &c) ;
		if (c>e) {
			e=c ;
		}
	}
	printf("en buyuk sayi = %d" , e) ;
	return 0 ;
	getchar () ;
}
