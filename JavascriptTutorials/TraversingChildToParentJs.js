function changeText() {
	
	var child = document.getElementById("p1");
	var parent = child.parentNode; // also: var parent = child.parentElement;
	
	parent.style.color = "blue" ;
	
}