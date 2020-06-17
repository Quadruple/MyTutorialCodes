// Bir sinifin ogrencilerinin numaralarini , vize ve finallerini ve ortalamalarini gösteren program
#include<stdio.h>
int main () {
	int a , e ;
	printf ("Sinifinizda kac ogrenciniz oldugunu giriniz :") ;
	scanf ("%d" , &a) ;
	int ogr_no [a] ;
	int vize [a] ;
	int final [a] ;
	int ort [a] ;
	for (e=0 ; e<a ; e++) {
		printf ("%d . ogrencinin numarasini giriniz :" , e+1) ;
		scanf ("%d" , &ogr_no[e]) ;
	}
	for (e=0 ; e<a ; e++) { 
		printf ("%d . ogrencinin vize notunu giriniz :" , e+1) ;
		scanf ("%d" , &vize[e]) ;
	}
	for (e=0 ; e<a ; e++) {
		printf ("%d . ogrencinin final notunu giriniz :" , e+1) ;
		scanf ("%d" , &final[e]) ;
	}
	ort [a] = (vize[a] + final[a]) / 2 ;
	for (e=0 ; e<a ; e++) {
		printf ("%d %d %d\n" , ogr_no[e] , vize[e] , final[e] , ort[e]) ;
	}
	getchar () ;
	return 0 ;
}
