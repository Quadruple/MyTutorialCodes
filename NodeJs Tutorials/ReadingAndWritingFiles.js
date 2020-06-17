var fs = require("fs"); // This is node.js's filestream export

// var readMe = fs.readFileSync("readMe.txt" , "utf8"); // This code is Synchronous code, meaning that it will block the code flow until this file is fully read. Its asynchronous version is just readFile();
// fs.writeFileSync("writeMe.txt" , readMe); // This code will write the data into a writeMe.txt file. This is synch version just like before. writeFile is asynch version

fs.readFile("readMe.txt" , "utf8" , function(err , data) {

  fs.writeFile('writeMe.txt', data + " written by fs ", function(err, result) {

     if(err) console.log('error', err); // This produces error message if file reading fails.

   });

});

// To delete the files you created : fs.unlink("writeMe.txt");
