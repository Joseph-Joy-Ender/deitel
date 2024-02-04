const expect = function (val) {
    return {
        toBe: (value) => {
            if(val === value) return true;
            else throw new Error("Not Equal");
        },
        notToBe: (values) => {
            if(val !== values) return true;
            else throw new Error("Equal");
        }
    }
};

console.log(expect(5).toBe(5));
console.log(expect(5).notToBe(5));