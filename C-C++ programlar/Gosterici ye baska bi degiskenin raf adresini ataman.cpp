// Gosterici ye baska bir degiskenin raf adresini atamak 
#include<stdio.h>
int main () {
	int a ;
	char harf1 = a ;
	printf ("%X\n" , &harf1) ;
	char *g = &harf1 ;
	printf ("%X" , g) ;
	getchar () ;
	return 0 ;
}
