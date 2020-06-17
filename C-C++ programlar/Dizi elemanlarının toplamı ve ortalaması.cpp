// Dizi elemanlarýnýn toplamý ve ortalamasý
#include<stdio.h>
int main () {
	int a , b , c , d , ataman , toplam = 0 , ort ;
	printf ("Dizide kac eleman olmasini istediginizi girin :") ;
	scanf ("%d" , &a) ;
	int atakan [a] ;
	ataman = sizeof (atakan) / sizeof (int) ;
	for (b=0 ; b<ataman ; b++) {
		printf ("Dizinizin %d indisli elemanini girin :" , b) ;
		scanf ("%d" , &atakan[b]) ;
	}
	for (c=0 ; c<ataman ; c++) {
		printf ("Dizinizin %d indisli elemani = %d\n" , c , atakan[c]) ;
	}
	for (d=0 ; d<ataman ; d++) {
		toplam = toplam + atakan[d] ;
	}
	printf ("Istediginiz toplam = %d\n" , toplam) ;
	ort = toplam / a ;
	printf ("Istediginiz ortalama = %d\n" , ort) ;
	getchar () ;
	return 0 ;
}
