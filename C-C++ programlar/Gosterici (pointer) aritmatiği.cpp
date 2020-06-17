// Gosterici (pointer) Aritmatiði ve Diziler
#include<stdio.h>
int main () {
	char harf1 = 'a' ;
	char *g = &harf1 ;
	printf ("ILk gosterici degeri : %X\n" , g) ;
	g++ ;
	printf ("Ikinci gosterici degeri : %X \n" , g) ;
	g=g+4 ;
	printf ("Ucuncu gosterici degeri : %X" , g) ;
	getchar () ;
	return 0 ;
}
