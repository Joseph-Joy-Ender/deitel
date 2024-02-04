const array = [1, 2, 3];
const map = function (array, fn){
    const newArray = [];
    let index = 0;
    for (const element of array){
        newArray[index] = fn(element, index);
        index++;
    }
    return newArray;
};

const fn = function plus(n){return n + 1};
console.log(map(array, fn));