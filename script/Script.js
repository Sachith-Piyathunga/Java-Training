/**
 * Display Current Day and Time
 * Write a JavaScript program to display the current day and time in the following format.
 * Today is : Tuesday.
 * Current time is : 10 PM : 30 : 38
 */

var today = new Date();
var day = today.getDay();
var daylist = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

console.log("Today is: " + daylist[day] + ".");

var hour = today.getHours();
var minute = today.getMinutes();
var second = today.getSeconds();

var prepand = (hour >= 12) ? " PM " : " AM ";


