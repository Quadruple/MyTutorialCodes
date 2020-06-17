// Dizi elemanlarýnýn konsoldan okunmasý
#include<stdio.h>
int main () {
	int i , ataman , t ;
	int atakan [4] ;
	ataman = sizeof (atakan) / sizeof (int) ;
	for (t=0 ; t<4 ; t++) {
		printf ("Dizide olmasini istediginiz %d. elemani giriniz :" , t) ;
		scanf("%d" , &atakan[t]) ;
	} 
	for (i=0 ; i<ataman ; i++) {
		printf ("Dizinizin %d indisli elemanlari = %d\n" , i , atakan[i]) ;
	}
	getchar () ;
	return 0 ;
}
