const arr = [1, 3, 4, 5];
const newArray = [];

arr.forEach((x) => {
   let ans = x % 2 === 0;
   console.log(ans);
});

arr.forEach((x) => {
    let ans = x * 3;
    newArray.push(ans);

});

console.log(newArray);
