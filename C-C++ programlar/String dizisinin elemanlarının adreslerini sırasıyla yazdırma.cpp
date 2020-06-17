// String dizisinin elemanlarýnýn adreslerini sýrasýyla yazdýrma
#include<stdio.h>
int main () {
	int i ;
	char ad[] =  "Atakan" ;
	printf ("String dizisinin ikinci elemaninin adresi : %X\n" , &ad[1]) ;
	int a = sizeof (ad) / sizeof(char) - 1 ;
	for (i=0 ; i<a ; i++) {
		printf ("String dizisinin elemanlarinin sirasiyla yazdirilmasi : %X\n" , &ad[i]) ;
	}
	printf ("String dizisini yazdiralim : \n") ;
	for (i=0 ; i<a ; i++) {
		printf ("%c" , ad[i]) ;
	}
	getchar () ;
	return 0 ;
}
