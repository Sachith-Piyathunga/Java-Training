const satellite = 'The Moon';
const galaxy = 'The Milky Way';
let stars = 'North Star';

const callMyNightSky = () => {
  stars = 'Sirius';
	return 'Night Sky: ' + satellite + ', ' + stars + ', ' + galaxy;
};

console.log(callMyNightSky()); // the answer tis = Night Sky: The Moon, Sirius, The Milky Way
console.log(stars); // Access the globale variable than the answer is = Sirius
