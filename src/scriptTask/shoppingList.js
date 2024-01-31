
const shoppingList = [
    {name: 'Apples', category: 'Fruits', isHealthy: true},
    {name: 'Potato Chips', category: 'Snacks', isHealthy: false},
    {name: 'Carrots', category: 'Vegetables', isHealthy: true},
    {name: 'Chocolate Bars', category: 'Sweets', isHealthy: false},
    {name: 'Greek Yogurt', category: 'Diary', isHealthy: true},
    {name: "Soda", category: "Beverages", isHealthy: false}
]

const healthyItems = shoppingList.filter((word) => word.isHealthy === true);

healthyItems.forEach((word) => {console.log(word.name)});