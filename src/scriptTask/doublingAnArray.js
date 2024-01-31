const array = [2, 3, 4, 5, 6, 7];
const newArray = [];

array.forEach((x) => newArray.push(x + x));
console.log(newArray);