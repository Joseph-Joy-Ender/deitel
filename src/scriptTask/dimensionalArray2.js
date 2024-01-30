// let raw_array = [
//                         [
//                         ["name", "Joy"],
//                         ["population", 200],
//                         ["temp", 23],
//                         ["currency", "1000"]
//                         ],
//
//                         [["name", "Joseph"],
//                         ["population", 100],
//                          ["temp", 12],
//                          ["currency", "2000"]
//                         ],
//
//                         [["name", "Ender"],
//                         ["population", 1000],
//                         ["temp", 21],
//                         ["currency", "5000"]]
//
// ]
//
// let result1 = raw_array[0][1]
// let result2 = raw_array[1][1]
// let result3 = raw_array[2][1]
//
// let answer1 = result1[1];
// let answer2 = result2[1];
// let answer3 = result3[1];
//
// console.log("total population is: ", answer1 + answer2 + answer3)

let object = {
    name: "Joseph",
    population: 1200,
    temp: 21,
    currency: "Naira"

};
let object2 = {
    name: "Joy",
    population: 1300,
    temp: 23,
    currency: "Dollar"
};
let object3 = {
    name: "Ender",
    population: 2500,
    temp: 29,
    currency: "Sterling"
}

let arr = [[null,object,object2,object3],
                  [object, object3, null, object2],
                  [object3, null, object2, object]]

let result = 0;

for (const key in arr) {
    for (const newKey in arr[key]){
        if(arr[key][newKey] != null){
            result += arr[key][newKey].population
        }
    }

}

console.log("The total population = ", result)