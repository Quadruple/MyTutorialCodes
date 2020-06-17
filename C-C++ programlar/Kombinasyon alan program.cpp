// Kombinasyon alan program
#include<stdio.h>
int faktoriyel (int f) {
	int i , b=1 ;
	for (i=1 ; i<f+1 ; i++) {
		b = b * i ;
	}
	return b ;
}
int main () {
	int n , m , C , d , e , f , g ;
	printf ("C(n,m) ' de n=") ;
	scanf("%d" , &n) ;
	printf ("C(n,m) ' de m=") ;
	scanf("%d" , &m) ;
	d = faktoriyel(n) ;
	e = faktoriyel(m) ;
	f = faktoriyel((n-m)) ;
	C = d / (e * f) ;
	printf("C(%d , %d) = %d" , n , m , C) ;
	return 0 ;
	getchar () ;
}
