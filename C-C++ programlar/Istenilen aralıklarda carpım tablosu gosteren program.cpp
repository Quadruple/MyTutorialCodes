// Istenilen Aralýklarda Carpým Tablosu Gösteren Program
#include<stdio.h>
int main () {
	int a , b , s , carpim ;
	printf("Araligin baslangic degerini girin :") ;
	scanf("%d" , &a) ;
	printf("Araligin son degerini girin :") ;
	scanf("%d" , &b) ;
	for (; a<=b ; a++) {
		for (s=a; s<=b ; s++) {
			carpim = a * s ;
			printf("%d x %d = %d\n" , a , s , carpim) ;
		}
	}
	return 0 ;
	getchar () ;
}
