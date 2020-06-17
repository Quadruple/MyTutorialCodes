var http = require("http");

var server = http.createServer(function(req , res) { // This is a function with request and response variables

  console.log("Request was made by: " + req.url); // req.url is for accessing which url made the request. With this variable you can change the response according to the url
  res.writeHead(200 , {"Content-Type": "text/plain"}); // writeHead is for adjusting the response. You can spesify more file types for more responses like txt/json/html ... 200 is status
  res.end("Hey yo, this is my local servers response to your stupid request!"); // This is the response of the server

});

server.listen(3000 , "127.0.0.1"); // This is for localhost port number 3000, listens
console.log("Started to listen to port 3000 of localhost");
