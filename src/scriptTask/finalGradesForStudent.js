const studentScores = [95, 78, 85, 60, 45, 92];
const newArray = [];
studentScores.map((scores) => {
    if (scores >= 90){
        newArray.push("A");
    }else if (scores >= 80){
        newArray.push("B");
    }else if (scores >= 70){
        newArray.push("C");
    }else if (scores >= 60){
        newArray.push("D");
    }else {
        newArray.push("F");
    }
});

console.log(newArray);