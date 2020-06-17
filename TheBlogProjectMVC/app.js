var express = require('express');
var appController = require('./controllers/appController');

var app = express();

//set up template engine
app.set('view engine' , 'ejs');

//static files goes here without mapping them to a spesific url
app.use("/public" , express.static("public"));

//fire controllers
appController(app);

//listen to port
app.listen(3000);
console.log('You are listening to port 3000');
