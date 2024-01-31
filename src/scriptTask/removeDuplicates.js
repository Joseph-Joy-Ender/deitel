const array = [2, 3, 6, 8, 9, 21, 2, 2, 2];
const newArray = [];


const result = array.filter((item, index) => array.indexOf(item) === index);
newArray.push(result);
console.log(newArray);