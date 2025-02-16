function* getEmployee() {
    console.log('the function has started');

    const names = ['Amanda', 'Diego', 'Farrin', 'James', 'Kagure', 'Kavita', 'Orit', 'Richard'];

    for (const name of names) {
        yield name;
    }

    console.log('the function has ended');
}
const generatorIterator = getEmployee();
let result = generatorIterator.next();
result.value

generatorIterator.next().value 
generatorIterator.next().value 