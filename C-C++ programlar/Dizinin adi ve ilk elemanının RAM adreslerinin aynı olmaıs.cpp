// Dizinin adý ve ilk elemanýnýn RAM bellek adreslerinin ayný olmasý
#include<stdio.h>
int main () {
	char harfler[] = {'a' , 'b' , 'c' , 'd' , 'e'} ;
	printf ("Dizinin ilk elemaninin RAM adresi : %X\n" , &harfler[0]) ;
	printf ("Dizinin adi :%X\n" , &harfler) ;
	getchar () ;
	return 0 ;
}
