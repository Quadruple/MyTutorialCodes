/* Regular function calls

  function hello() {

    console.log("hello");

  }

  hello();

*/

// Function expressions
function callFunction(fun) {

  fun();

}

var sayBye = function() { // This is an anonymous function

  console.log("bye");

};

callFunction(sayBye); // This is how you call an anonymous function
