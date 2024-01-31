const array = [ ];
let answer = false;
array.forEach((word) =>{
    if (word === null){
        answer = true;
    }
});

console.log(answer);