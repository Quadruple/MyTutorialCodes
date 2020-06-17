function changeStyle() {
	
	var paragraph = document.getElementsByClassName("para") ;
	
	var firstText = paragraph[0].innerHTML ;
	var secondText = paragraph[1].innerHTML ;
	
	paragraph[2].innerHTML = firstText + secondText ;
	
	paragraph[0].innerHTML = " " ;
	paragraph[1].innerHTML = " " ;
	
}