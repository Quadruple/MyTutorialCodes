var time = 0 ;

var timer = setInterval(function() {

  time += 2 ;
  console.log(time + ' seconds have passed');
  if(time > 5) {

    clearInterval(timer); // This part of the code stops the interval when time becomes more than 5

  }

} , 2000);

// This code is for setTimeout function that waits for 3 seconds and calls the function
/* setTimeout(function() {

  console.log('3 seconds have passed');

} , 3000); */

// The code for telling the directory we are working at is : console.log(__dirname); __dirname is a global object that holds the directory we are in
// __filename is also available
