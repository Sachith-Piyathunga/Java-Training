const groceryList = ['orange juice', 'bananas', 'coffee beans', 'brown rice', 'pasta', 'coconut oil', 'plantains'];

groceryList.shift(); // Using th shift we can remove the first item in the array
console.log(groceryList);

groceryList.unshift('popcorn'); // Can do the opposite of the shift method
console.log(groceryList);

console.log(groceryList.slice(1, 4)); // access the any element withing a range
console.log(groceryList.slice(4));
console.log(groceryList);

const pastaIndex = groceryList.indexOf('pasta');
console.log(pastaIndex); // Check the index