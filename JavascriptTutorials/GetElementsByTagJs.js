function changeStyle() {
	
	var paragraph = document.getElementsByTagName("p"); // This function returns all <p> elements in an array. So paragraph variable is an array.
	
	for (var i = 0 ; i < paragraph.length ; i++) {
		
		var changeParaText = paragraph[i].style.fontStyle = "italic";
		
	}
	
	//var changeParaText = paragraph[0].style.fontStyle = "italic";
	//var changeParaText = paragraph[1].style.fontStyle = "italic";
	//var changeParaText = paragraph[2].style.fontStyle = "italic";
	//var changeParaText = paragraph[3].style.fontStyle = "italic";
	
}