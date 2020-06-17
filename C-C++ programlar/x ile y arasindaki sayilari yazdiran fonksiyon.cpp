// x ile y arasýndaki sayilari yazdýran fonksiyon 
#include<stdio.h>
int aralik (int a , int b) {
	for (; a<=b ; a++) {
		printf ("%d\n" , a) ;
	}
	return a ;
}
int main () {
	int s , f ;
	printf ("Yazdirmak istediginiz araligin ilk sayisini girin :") ;
	scanf ("%d" , &s) ;
	printf ("Yazdirmak istediginiz araligin ikinci sayisini girin :") ;
	scanf ("%d" , &f) ;
	aralik (s , f) ;
	getchar () ;
	return 0 ;
}
