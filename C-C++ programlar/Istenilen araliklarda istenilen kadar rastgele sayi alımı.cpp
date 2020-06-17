// Istenilen aralýklarda istenilen kadar rastgele sayi alimi
#include<stdio.h>
#include<stdlib.h>
int main () {
	int a , b , c , i , d , sayilar[a] ;
	printf("Kac adet rastgele sayi :") ;
	scanf("%d" , &a) ;
	printf("Araligin baslangic degeri :") ;
	scanf("%d" , &b) ;
	printf("Araligin bitis degeri :") ;
	scanf("%d" , &c) ;
	for (i=1 ; i<a+1 ; i++) {
		sayilar[i] = rand()%(c-b)+b ;
	}
	for (i=1 ; i<a+1 ; i++) {
		printf("%d . rastgele sayiniz = %d \n" , i , sayilar[i]) ;
	}
	return 0 ;
	getchar () ;
}
