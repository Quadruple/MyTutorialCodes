// For D�ng�s�yle 0 ' dan N ' e kadar olan �ift sayilarin toplam�
#include<stdio.h>
int main () {
	int s , top=0 ;
	for (s = 0 ; s<=10 ; s = s + 2) 
		top = top + s ;
	printf("%d" , top) ;
	getchar() ;
	return 0 ;
		
}
