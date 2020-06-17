// Fonksiyonla Sayýný Karesini Alma
#include<stdio.h>
int kare (int n) {
	int kare ;
	kare = n * n ;
	return kare ;
}
 int main () {
 	int s ;
 	printf ("Karesini almak istediginiz sayiyi girin :") ;
 	scanf ("%d" , &s) ;
 	printf("%d" , kare(s)) ;
 	return 0 ;
 }
