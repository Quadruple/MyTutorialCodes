// Sayinin kac basamaklý oldugunu bulmak
#include<stdio.h>
int main () {
	int a , s=1 ;
	printf("Bir tam sayi giriniz :") ;
	scanf("%d" , &a) ;
	if (a<10) {
		printf("Sayiniz 1 basamaklidir !") ;
	}
	else if (a>=10) {
		while (a>10) {
			a = a / 10 ;
			s++ ;
		}
		printf ("%d" , s) ;
	}
	return 0 ;
	getchar () ;
}

