// Metinler karsilastirma programi
#include<stdio.h>
#include<string.h>
int main () {
	char metin1[250] ;
	char metin2[250] ;
	int sonuc ;
	printf("Karsilastirilacak ilk metini giriniz :") ;
	gets(metin1) ;
	printf("Karsilastirilacak ikinci metini giriniz :") ;
	gets(metin2) ;
	sonuc = strcmp(metin1 , metin2) ;
	if (sonuc > 0) {
		printf("Metin1 daha buyuk bir metin") ;
	}	
	else if (sonuc == 0) {
		printf("Metinleriniz ayni") ;
	}
	else {
		printf("Metin2 daha buyuk bir metin") ;
	}
	return 0 ;
	getchar () ;
}
