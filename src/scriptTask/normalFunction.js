function questions(role){
    switch (role){
        case 'manager':
            return function (name) {
                return `Hi ${name}, what is the core value of the company?`;
            };

        case 'native':
            return function (name){
                return `Hi ${name}, what is your best programming language?`;
            }
        case 'elders':
            return function (name){
                return `Hi ${name}, do you love your job?`;
            }
    }

}

let answer = questions("manager");
console.log(answer('Joy'));