const createCounter = function(init) {
    let currentValue = init;
    return {
        increment: () => {
            return currentValue += 1;
        },
        decrement: () => {
            return currentValue -= 1;
        },
        reset: () => {
            return currentValue = init;

        }
    }

};
const counter = createCounter(5);
console.log(counter.increment());
console.log(counter.reset());
console.log(counter.decrement());

