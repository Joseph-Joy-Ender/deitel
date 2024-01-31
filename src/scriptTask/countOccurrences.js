const array = [1, 2, 2, 3, 2, 4, 2, 7];
let count = 0;
let value = 1;

array.forEach((x) => {
    if (value === x){
        count++;
    }
});

console.log(count);