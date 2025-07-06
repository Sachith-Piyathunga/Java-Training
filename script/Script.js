const cards = ['diamond', 'spade', 'heart', 'club'];

// Write your code below
let currentCard; // Declare the variable call currentCard

while (currentCard !== 'spade') { // Create a while loop, that does not have value spade
  currentCard = cards[Math.floor(Math.random() * 4)];
	console.log(currentCard);
}