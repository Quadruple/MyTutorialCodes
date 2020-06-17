var counter = function(arr) {

  return "There are " + arr.length + " elements in this array" ;

};

var adder = function(a , b) {

  return "The sum of 2 numbers is " + (a + b) ;

};

var pi = 3.142;

module.exports= { // There are 2 more ways to do this as below

  counter: counter,
  adder: adder,
  pi: pi

};

/*

  modules.exports.counter = function(arr) {

    return "There are " + arr.length + " elements in this array" ;

  };

  OR

  module.exports.counter = counter;
  module.exports.adder = adder;
  module.exports.pi = pi;

 */
