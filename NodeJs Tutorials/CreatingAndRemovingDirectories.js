var fs = require("fs");

fs.mkdir("stuff" , function() { // This creates a directory in the workingspace. There is also mkdirSync();

  fs.readFile("readMe.txt" , "utf8" , function(err , data) {

    fs.writeFile('./stuff/writeMeIntoDir.txt', data + " written by fs into directory" , function(err, result) {

       if(err) console.log('error', err); // This produces error message if file reading fails.

     });

  });

});

// to remove a directory you should use rmdir(); The directory that is going to be removed should be empty. So fs.unlink(); the other files and then remove the diretory
