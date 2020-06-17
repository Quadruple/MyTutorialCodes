function newParagraph() {
	
	//This creates a Header element
	
	var elementH = document.createElement("h2");
	var main = document.getElementById("main");
	
	main.appendChild(elementH);
	
	var textH = document.createTextNode("Shit Heading");
	
	elementH.appendChild(textH);
	
	// This creates a paragraph element
	
	var element = document.createElement("p");
	
	main.appendChild(element);
	
	var text = document.createTextNode("This is another shit paragraph element to add to the same div.");
	
	element.appendChild(text);
	
	// This adds a CSS Attribute to the existing paragraph element
	
	var pAttribute = document.createAttribute("id");
	pAttribute.value = "addThisAttributeWithJavaScript" ;
	
	element.setAttributeNode(pAttribute);
	
}

function removeAdded() {
	
	var elementH = document.getElementsByTagName("h2")[0];
	var parent = elementH.parentNode;
	parent.removeChild(elementH);
	
	var elementP = document.getElementsByTagName("p")[2];
	parent.removeChild(elementP);
	
}