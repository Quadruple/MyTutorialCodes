var express = require("express");

var app = express();

app.get("/" , function(req , res){

  res.send("this is home page!");

});

app.get("/contact" , function(req , res){

  res.send("this is contact us page!");

});

app.get("/profile/:name" , function(req , res){ // This is for listening dynamic get responses. The url is changing as the profile owner's name is changed.

  res.send("You requested to see a profile with the name of " + req.params.name); // To reach the dynamic url's property, you can use req variable. req.params.dynamicproperty

});

app.listen(3000);
