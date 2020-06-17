var express = require("express");
var app = express();

app.set("view engine" , "ejs");

app.get("/" , function(req , res){

  res.sendFile(__dirname + "/index.html"); // This is how you send html pages with express.

});

app.get("/contact" , function(req , res){

  res.sendFile(__dirname + "/contact.html");

});

app.get("/profile/:name" , function(req , res){ // This is for listening dynamic get responses. The url is changing as the profile owner's name is changed.

  var data = {age: 29 , job: "ninja" , hobbies: ["eating" , "fighting" , "fishing"]};
  res.render("profile" , {person: req.params.name , data: data}); // This is how you reach and display ejs files through express

});

app.listen(3000);
