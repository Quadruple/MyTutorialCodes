// 3 sat�r 2 sutundan olu�an dizilerin elemanlar�n�n ekrana yazd�rma
#include<stdio.h>
int main () {
	int a , b ;
	int atakan [3] [2] = {{1,2} , {4,5} , {10,11}} ;
	for (a=0 ; a<3 ; a++) {
		for (b=0 ; b<2 ; b++) {
			printf ("%d %d %d\n" , a , b , atakan[a][b]) ;
		}
	}
	getchar () ;
	return 0 ;
}

