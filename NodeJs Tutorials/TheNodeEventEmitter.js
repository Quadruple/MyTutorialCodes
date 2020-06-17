var events = require("events"); // This is like a node.js library. The events are pre-exported
// element.on("click" , function(){});

// You can create custom events. You need to use emit function to trigger custom events
/*
  var myEmitter = new events.EventEmitter();

  myEmitter.on("someCustomEvent" , function(mssg) {

    console.log(mssg);

  });

  myEmitter.emit("someCustomEvent");
*/

var util = require("util");

var Person = function(name) {

  this.name = name;

};

util.inherits(Person , events.EventEmitter);

var james = new Person("james");
var max = new Person("max");
var isabella = new Person("isabella");
var people = [james , max , isabella];

people.forEach(function(Person) {

  Person.on("speak" , function(mssg) {

    console.log(Person.name + " said: " + mssg);

  });

});

james.emit("speak" , "hey dudes"); // This code emits the speak event and passes "hey dudes" to the function spesified Person.on("speak" , function(mssg)
max.emit("speak" , "This place smells like shit");
isabella.emit("speak" , "Fingers crossed yo");
