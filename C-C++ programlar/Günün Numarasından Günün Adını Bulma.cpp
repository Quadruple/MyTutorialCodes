// Haftan�n G�n�n�n Numaras�ndan Haftan�n Ad�n� Bulmak 
#include<stdio.h>
int main () {
	char gun_no ;
	printf("Haftan�n Kac�nc� Gununde Oldugunuzu Belirtin :") ;
	scanf("%d" , &gun_no) ;
	switch(gun_no) {
		case 1 : printf("Gunlerden Pazartesi") ; 
		break ;
		case 2 : printf("Gunlerden Sali") ;
		break ;
		case 3 : printf("Gunlerden Carsamba") ;
		break ;
		case 4 : printf("Gunlerden Persembe") ;
		break ;
		case 5 : printf("Gunlerden Cuma") ;
		break ;
		case 6 : printf("Gunlerden Cumartesi") ;
		break ;
        case 7 : printf("Gunlerden Pazar") ;
		break ;		
	}
	getchar() ;
	return 0 ;
}
