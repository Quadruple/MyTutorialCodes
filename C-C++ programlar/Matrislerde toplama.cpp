// Matris islemleri
#include<stdio.h>
int main () {
	int a[2][3] = { {1,2,3} , {4,5,6} } ;
	int b[2][3] = { {10,11,12} , {13,14,15} } ;
	int c[2][3] ;
	int d , e ;
	for (d=0 ; d<2 ; d++) {
		for (e=0 ; e<3 ; e++) {
			c[d][e] = a[d][e] + b[d][e] ;
			printf ("%d\n" , c[d][e]) ;
		}
	}
	getchar () ;
	return 0 ;
}
