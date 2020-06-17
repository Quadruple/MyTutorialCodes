var bodyParser = require('body-parser');
var mysql = require('mysql');

var urlencodedParser = bodyParser.urlencoded({extended: false});

module.exports = function(app) {

  app.get("/anasayfa" , function(req , res) {

    res.render("index");

  });

  app.post("/anasayfa" , urlencodedParser , function(req , res) {

    var fullname = req.body.fullname;
    var email = req.body.email;
    var password = req.body.password;

    // Creating a connection for the database
    var con = mysql.createConnection({

      host: "localhost",
      user: "test",
      password: "test",
      database: "theblogproject"

    });
    
    //Preparing the sql statement
    var sql = "INSERT INTO members (fullname, email, password) VALUES ('" + fullname + "' , '" + email + "' , '" + password + "')" ;

    // Connecting to the database and update...
    con.connect(function(err) {

      if(err) {

        throw err;

      }else {

        con.query(sql , function(err , result) {

          if(err) {

            throw err;

          }else {

            console.log("1 record inserted successfully!");

          }

        });

      }

    });

  });

}
