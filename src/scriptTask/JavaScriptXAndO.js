let obj = [
    {row: 0, col: 0, value: "x"},
    {row: 0, col: 1, value: "x"},
    {row: 0, col: 2, value: "o"},
    {row: 1, col: 0, value: "o"},
     // {row: 1, col: 1, value: " "},
    {row: 1, col: 2, value: "x"},
    {row: 2, col: 0, value: "x"},
    {row: 2, col: 1, value: "o"},
    {row: 2, col: 2, value: "o"},
]
let newArray = [[],
                       [],
                       []]


for (const objKey of obj) {
    newArray[objKey.row][objKey.col] = objKey.value;
}
 console.log(newArray);

