// Sayýsal loto (kitaptan örnek)
#include<stdio.h>
#include<stdlib.h>
int main () {
	int sayisal[6] , s ; 
	for (s=0 ; s<6 ; s++) {
		sayisal[s] = rand()%20 + 10 ;
	}
	for (s=0 ; s<6 ; s++) {
		printf("%d\n" , sayisal[s]) ;
	}
	return 0 ;
	getchar () ;
} 
