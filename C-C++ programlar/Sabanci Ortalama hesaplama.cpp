#include<stdio.h>
int main() {
	double LE1 , LE2 , HP1 , HP2 , HP3 , HP4, ATT1 , ATT2 , ATT3 , ATT4, LP1 , CTSS , Midterm , SAE , OA , OBE , LP2 , EMS , FINAL ,  a , b , c , d , e , f , g , h , i , j , k , l , m , q , w , y , z , t , o , ort ;
	printf("Not:Bu program ortalamayi degil simdiye kadar kac puan aldiginizi bulmak icindir !\n") ;
	printf("FINAL Notunuz :\n") ;     scanf("%lf" , &FINAL) ;
	o = FINAL * 20/100 ;
	printf("o=%lf\n" , o) ; 
	printf("ATT4 Notunuz :\n") ;      scanf("%lf" , &ATT4) ;
	t = ATT4 * 1.25/100 ;
	printf("t=%lf\n" , t) ;
	printf("HP4 Notunuz :\n") ;       scanf("%lf" , &HP4) ;
	z = HP4 * 1.25/100 ;
	printf("z=%lf\n" , z) ;
	printf("EMS Notunuz :\n") ;      scanf("%lf" , &EMS) ;
	y = EMS * 5/100 ;
	printf("y=%lf\n" , y) ;
	printf("LP2 Notunuz : \n") ;     scanf("%lf" , &LP2) ;
	w = LP2 * 2.5/100 ;
	printf("w=%lf\n" , w ) ;
	printf("OBE Notunuz :\n") ;      scanf("%lf" , &OBE) ;
	q = OBE * 15/100 ;
	printf("q=%lf\n" , q) ;
	printf ("LE1 Notunuz :\n") ;     scanf("%lf" , &LE1) ;
	a = LE1 * 2.5/100 ;
	printf ("a=%lf\n" , a) ;
	printf ("LE2 Notunuz :\n") ;     scanf("%lf" , &LE2) ;
	b = LE2 * 2.5/100 ;
	printf ("b=%lf\n" , b) ;
	printf ("HP1 Notunuz :\n") ;     scanf("%lf" , &HP1) ;
	c= HP1 * 1.25/100 ;
	printf("c=%lf\n" , c) ;
	printf ("HP2 Notunuz :\n") ;     scanf("%lf" , &HP2) ;
	d = HP2 * 1.25/100 ;
	printf("d=%lf\n" , d) ;
	printf ("HP3 Notunuz :\n") ;     scanf("%lf" , &HP3) ;
	e = HP3 * 1.25/100 ;
	printf("e=%lf\n" , e) ;
	printf("ATT1 Notunuz :\n") ;     scanf("%lf" , &ATT1) ;
	f = ATT1 * 1.25/100 ;
	printf("f=%lf\n" , f) ;
	printf("ATT2 Notunuz :\n") ;     scanf("%lf" , &ATT2) ;
	g = ATT2 * 1.25/100 ;
	printf("g=%lf\n" , g) ;
	printf("ATT3 Notunuz :\n") ;     scanf("%lf" , &ATT3) ;
	h = ATT3 * 1.25/100 ;
	printf("h=%lf\n" , h) ;
	printf("LP1 Notunuz :\n") ;       scanf ("%lf" , &LP1) ;
	i = LP1 * 2.5/100 ;
	printf("i=%lf\n" , i) ;
	printf("CTSS Notunuz :\n") ;      scanf("%lf" , &CTSS) ;
	j = CTSS * 5/100 ; 
	printf("j=%lf\n" , j) ;
	printf("Midterm Notunuz :\n") ;   scanf ("%lf" , &Midterm) ;
	k = Midterm * 20 / 100 ;
	printf("k=%lf\n" , k) ;
	printf ("SAE Notunuz :\n") ;      scanf("%lf" , &SAE) ;
	l = SAE * 10/100 ;
	printf("l=%lf\n" , l) ;
	printf("OA Notunuz :\n") ;        scanf("%lf" , &OA) ;
	m = OA * 5/100 ;
	printf("m=%lf\n" , m) ;
	ort = (a + b + c + d + e + f + g + h + i + j + k + l + m + q + w + y + z + t + o)  ;  
	printf("ort=%lf" , ort) ;	
	if (ort>80) 
	   printf ("Tebrikler , iyi notlar almissiniz!!") ;
	else 
	   printf ("�zg�n�z , notlariniz sinifi gecmeye yeterli degil!!") ;
    getchar() ;
    return 0 ;
}