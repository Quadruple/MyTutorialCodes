// Iki kenar uzunlugu veirlen ucgenin ucuncu kenarýnýn bulunmasý
#include<stdio.h>
#include<math.h>
#define pi 3.14 
int main () {
	double a , b , aci , radyan , UcuncuKenar ;
	printf("Ucgenin birinci kenar uzunlugu :") ;
	scanf("%lf" , &a) ;
	printf("Ucgenin ikinci kenar uzunlugu : ") ;
	scanf("%lf" , &b) ;
	printf("Ucgenin kenarlar arasýndaki acisi :") ;
	scanf("%lf" , &aci) ;
	radyan = aci * pi / 180 ;
	printf ("Acinizin radyan hali = %lf\n" , radyan) ;
	UcuncuKenar = sqrt(a*a + b*b - a*b*cos(radyan)) ;
	printf("Ucgenin ucuncu kenari = %f" , UcuncuKenar) ;
	return 0 ;
	getchar () ; 
}
