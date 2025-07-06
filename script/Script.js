// Write your code below
const bobsFollowers = ['pesandu', 'nemitha', 'sani', 'naavya'];
const tinasFollowers = ['saran', 'naavya', 'sani'];
const mutualFollowers = [];

for (let i = 0; i < bobsFollowers.length; i++){
  for (let j= 0; j < tinasFollowers.length; j++){
    if (bobsFollowers[i] === tinasFollowers[j]){
      mutualFollowers.push(bobsFollowers[i]);
    }
  }
}