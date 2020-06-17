//1000 e kadar 3 ve 5 in katları
#include<stdio.h>
int main () {
	int a=0 , b=0 , c=0 , d ;
	for (int i=1 ; i<1000 ; i++ ) {
		if (i%3==0) {
			a = a + i ;
		}
		else if (i%5==0) {
			b = b + i ;
		}
		else if (i%3==0 && i%5==0) {
			c = c + i ;
		}
	}
	d = a + b - c ; 
	printf ("%d" , d) ;
	return 0 ;
	getchar () ;
}
