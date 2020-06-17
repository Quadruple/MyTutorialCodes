// N elemanlý dizi olusturulmasý ve atanmasý
#include<stdio.h>
int main () {
	int a , b , c , ataman ;
	printf ("Dizinizde kac eleman olmasini istediginizi giriniz :") ;
	scanf ("%d" , &a) ;
	int atakan [a] ;
	ataman = sizeof(atakan) / sizeof(int) ;
	for (b=0 ; b<ataman ; b++) {
		printf ("Dizinizdeki %d indisli elemani giriniz :" , b , atakan[b]) ;
		scanf ("%d" , &atakan[b]) ;
	}
	for (c=0 ; c<ataman ; c++) {
		printf ("Dizinizdeki %d indisli eleman = %d\n" , c , atakan[c]) ;
	}
	getchar () ;
	return 0 ;
}
