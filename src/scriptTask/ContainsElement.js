const array = [12, 4, 5, 6, 8];
const value = 20;

let ans = false;
array.forEach((x) => {
    if (value === x){
        ans = true;
    }
});
console.log(ans);