// Mod Alma Programý
#include<stdio.h>
int main () {
	int sayi ;
	printf("Tek mi cift mi diye kontrol edilecek sayiyi giriniz :") ;
	scanf("%d" , &sayi) ;
	printf("Sayiniz = %d\n" , sayi) ;
	if (sayi%2 == 0) {
		printf ("Sayiniz cift bir sayi !") ;
	}
	else {
		printf("Sayiniz tek bir sayi !") ;
	}
	return 0 ;
	getchar () ;
}
