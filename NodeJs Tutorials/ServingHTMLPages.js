var http = require("http");
var fs = require("fs");

var server = http.createServer(function(req , res){

  console.log("request was made" + req.url);
  res.writeHead(200 , {"Content-Type": "text/html"});
  var myReadStream = fs.createReadStream(__dirname + "/index.html" , "utf8");
  myReadStream.pipe(res); // Pipe transfers the readed stream into response of the server

});

server.listen(3000 , "127.0.0.1");
console.log("now listening local with port 3000");
