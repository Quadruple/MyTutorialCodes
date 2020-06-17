var express = require("express");
var app = express();

app.set("view engine" , "ejs");

app.get("/" , function(req , res){

  res.render("index"); // This is how you send html pages with express.
  /* If you want to carry all the css rules to an external file like styles.css, to make it work you need to use some middleware

  the middleware code : app.user('/assets' , express.static('stuff')); /assets is for creating the url to handle the 404, stuff is the filename which includes the CSS attributes */

});

app.get("/contact" , function(req , res){

  res.render("contact");

});

app.get("/profile/:name" , function(req , res){ // This is for listening dynamic get responses. The url is changing as the profile owner's name is changed.

  var data = {age: 29 , job: "ninja" , hobbies: ["eating" , "fighting" , "fishing"]};
  res.render("profile" , {person: req.params.name , data: data}); // This is how you reach and display ejs files through express

});

app.listen(3000);
