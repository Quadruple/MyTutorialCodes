// Dizi elemanlarýnýn sizeof ile konsola yazdýrýlmasý
#include<stdio.h>
int main () {
	int ilk_dizi[] = {1 , 2 , 3 , 4} ;
	int ikinci_dizi[] = {5 , 6 , 7 ,8} ;
	int atakan , ataman , k , l ;
	atakan = sizeof(ilk_dizi) / sizeof(int) ;
	for (k=0 ; k<atakan ; k++) {
		printf ("Ilk dizideki %d indisli eleman = %d\n" , k , ilk_dizi[k]) ;		
	}
	for (l=0 ; l<ataman ; l++) {
		printf ("Ikinci dizideki %d indisli eleman = %d\n" , l , ikinci_dizi[l]) ;
	}
	getchar () ;
	return 0 ;
}
