var express = require("express");
var bodyParser = require("body-parser");
var app = express();

app.set("view engine" , "ejs");
var urlencodedParser = bodyParser.urlencoded({extended: false});

app.get("/" , function(req , res){

  res.render("index"); // This is how you send html pages with express.

});

app.get("/contact" , function(req , res){

  res.render("contact" , {qs: req.query}); // You can access the data on the query string from the url by req.url. contact?department=IT&person:atakan is an example query string

});

app.post("/contact" , urlencodedParser , function(req , res){

  console.log(req.body);
  res.render("contact-success" , {data: req.body}); // You can access the data on the query string from the url by req.url. contact?department=IT&person:atakan is an example query string

});

app.get("/profile/:name" , function(req , res){ // This is for listening dynamic get responses. The url is changing as the profile owner's name is changed.

  var data = {age: 29 , job: "ninja" , hobbies: ["eating" , "fighting" , "fishing"]};
  res.render("profile" , {person: req.params.name , data: data}); // This is how you reach and display ejs files through express

});

app.listen(3000);
