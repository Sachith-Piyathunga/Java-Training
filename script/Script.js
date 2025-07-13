/**
 * Days Left Before Christmas
 * Write a JavaScript program to calculate the days left before Christmas.
 */

today = new Date();

var cmas = new Date (today.getFullYear(), 11, 25);

if (today.getMonth() == 11 && today.getDate() > 25) {
  cmas.setFullYear(cmas.getFullYear() + 1);
}

