function changeText() {
	
	var parent = document.getElementById("main");
	var child = parent.firstElementChild; // This selects the first element This can also be called by lastElementChild
	child.style.color = "blue";
	
	// var child = parent.childNodes[5]; This function counts whitespace as child node. And it starts from 1
	
}