function validateForm() {
	
	var box = document.getElementById("name");
	var box2 = document.getElementById("address");
	
	if(box.value.length < 5 || box2.value.length < 5) {
		
		alert("The field marked in red cannot be blank");
		box.focus();
		box.style.border = "solid 3px red";
		return false;
		
	}
	
}

// If you want to confirm any action on the website by a confirmation box, code below will do the work:

// var confirmation = confirm("These changes are final");

// if(confirmation == true) {action you want to do that is irreversible goes here}

// Redirecting a new webpage in javascript : 

	// window.location("newsite.html");