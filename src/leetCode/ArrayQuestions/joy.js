function expect (value) {
    return {
        toBe(val) {

            if (value === val) {
                return true
            } else {
                return "Not equal"
            }

        },

        notToBe(val) {
            return value !== val;
        }
    }

}

console.log(expect(9).toBe(10))