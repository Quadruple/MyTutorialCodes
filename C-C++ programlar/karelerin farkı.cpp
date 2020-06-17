// (1^2 + 2^2 + 3^2 ...) - (1 + 2 + 3 + 4 + ...)^2 farkýný alan program
#include<stdio.h>
#include<math.h>
int main () {
	int a , b , c=0 , d=0 , e ;
	for (a=1 ; a<=100 ; a++) {
		b = pow(a,2) ;
		c = c + b ;
	}
	for (a=1 ; a<=100 ; a++) {
		d = d + a ;
	}
	e = pow(d,2) ;
	printf ("%d" , c-e) ;
	return 0 ;
	getchar () ;
}
