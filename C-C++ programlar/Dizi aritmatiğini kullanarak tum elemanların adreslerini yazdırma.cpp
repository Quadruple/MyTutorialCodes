// Dizi Aritmatiðini Kullanarak Tum elemanlaeýn adreslerini yazdýrma
#include<stdio.h>
int main () {
	int i ;
	char harfler[5] = { 'a' , 'b' , 'c' , 'd' , 'e'} ;
	printf ("Dizinin ikinci elemaninin adresi : %X\n" , &harfler[1]) ;
	for (i=0 ; i<5 ; i++) {
		printf ("Dizinin elemanlarinin sirasiyla adresleri : %X\n" , &harfler[i]) ;
	}
	getchar () ;
	return 0 ;
}
