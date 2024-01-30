let user = {
    firstName: "Joy",
    lastName: "Joseph",
    age: 12
};
for (const userKey in user) {
    user["lastName"] = "Udeme";
    //console.log(userKey + ":" + user[userKey]);
    console.log(user[userKey])
}
