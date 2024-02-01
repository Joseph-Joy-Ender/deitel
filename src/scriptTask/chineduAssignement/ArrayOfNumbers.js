const array = [1, 2, 3, 4, 5, 6,7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];
const newArray = [];
const secondArray = [];
const result = array.filter((num) => num % 2 === 0);

newArray.push(result);
 console.log(newArray);

result.forEach((ans) => {
    let multiple = ans * 2;
    secondArray.push(multiple)

});

console.log(secondArray);

const map1 = secondArray.map((answer) => answer * answer);
console.log(map1);
