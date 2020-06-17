// N faktoriyel fonksiyonu
#include<stdio.h>
int faktoriyel (int a) {
	int b , carpim = 1 ;
	for (b=1 ; b<=a ; b++) {
		carpim = carpim * b ;
	}
	printf ("%d" , carpim) ;
	return carpim ;
}
int main () {
	int x ;
	printf ("Faktoriyeli alinacak sayiyi girin :") ;
	scanf ("%d" , &x) ;
	printf ("%d" , x) ;
	printf("! = ") ;
	faktoriyel (x) ;
	getchar () ;
	return 0 ;
}
