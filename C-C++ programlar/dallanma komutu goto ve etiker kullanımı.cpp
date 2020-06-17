//Dallanma komutu (goto) ve etiket kullanýmý
#include<stdio.h>
int main () {
	int x , kare ;
	gir :
		printf("Sayi") ;
		scanf("%d" , &x) ;
		if (x<0) 
		goto gir ;
		kare = x * x ;
		printf("kare=%d" , kare) ;
		getchar() ;
		return 0 ;
}

