// 1 ' den N ' e kadar olan sayilarin faktoriyelini yazan fonksiyon
#include<stdio.h>
int aralikfaktoriyel (int a) {
	int b , carpim = 1 ;
	for (b=1 ; b<=a ; b++) {
		carpim = carpim * b ;
	}
	return carpim ;
}
int main () {
	int y , x ;
	printf ("Faktoriyeli alinacak son sayiyi giriniz :") ;
	scanf ("%d" , &x) ;
	for (y=1 ; y<=x ; y++) {
			printf ("y = %d  y! = %d\n" , y , aralikfaktoriyel(y)) ;
	}
	getchar () ;
	return 0 ;
}
