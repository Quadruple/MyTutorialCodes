// En Buyuk Asal Sayý
#include<stdio.h>
#include<conio.h>
int main () {
	long long int sayi ; 
	printf ("bir sayi giriniz :") ;
	scanf("%lli" , &sayi) ;
	for (long long int i=2 ; sayi>1 ; i++) {
		while (sayi%i==0) {
			printf ("%lli\n" , i) ;
			sayi = sayi / i ;
		}
	}
	return 0 ;
	getchar () ;
}
