var orc = {
	
	hair: "green",
	age: 26,
	stomachFull: false,
	eat: function() {
		
		document.write("YUM YUM");
		document.write("<br>");
		
	}
	
};

if(orc.stomachFull == false) {
	
	orc.eat();
	orc.stomachFull = true;
	
}

if(orc.stomachFull == true) {
	
	document.write("Orc feels full already. You can't feed it now.") ;
	
}

// orc.hair2 = "red"; Since hair2 property does not exist, hair2 property will be created automatically in orc object.
// delete orc.hair2; This will delete the defined property of the object orc 