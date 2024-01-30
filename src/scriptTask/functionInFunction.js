const humus = function (factor) {
    const ingredient = function (amount, unit, name){
        let ingredientAmount = factor * amount;
        if (ingredientAmount > 1){
            unit += "$";
        }
        return (`${ingredientAmount} ${unit} of ${name}`)
    }
    return ingredient(1, "cup", "juice");
}

const showCalculation = humus(1)
console.log(showCalculation)