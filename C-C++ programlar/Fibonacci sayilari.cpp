// fibonacci sayilari
#include<stdio.h>
int main () {
	int s1=1 , s2=1 , s3 , s=2 , n ;
	printf("Kac adet sayi istiyorsunuz :") ;
	scanf("%d" , &n) ;
	printf("%d\n%d\n" , s1 , s2) ;
	while (s<n) {
		s3 = s1 + s2 ;
		printf("%d\n" , s3) ;
		s1=s2 ;
		s2=s3 ;
		s++ ;
	}
	return 0 ;
	getchar () ;
}
