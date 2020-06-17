//Sadece Pozitif Sayilarin karesini Alan program ( Etiketli Versiyon)
#include<stdio.h>
int main() {
	int s , a ;
	sayigir:
		printf("sayi :") ;
		scanf("%d" , &s) ;
		if (s<0) {
			printf("Girdiginiz Sayi Hatali !\n") ;
			goto sayigir ;
		}
		a = s * s ;
		printf("s=%d a=%d" , s , a) ;
		getchar() ;
		return 0 ;
}
