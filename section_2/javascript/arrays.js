// arr: array of values
// operation: function that takes a value, we don't
//            care about what it returns (ignored)
function forEach(arr, operation) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        operation(element);
    }
}

function printAll(arr) {
    forEach(arr, (e) => console.log(e));
}

function printAllPlusN(arr, n) {
    forEach(arr, (e) => console.log(e + n));
}

// arr: array of values
// operation: function
//              Takes a value (one at a time, from array)
//              Returns some new value
function mapInPlace(arr, operation) {
    for (let index = 0; index < arr.length; index++) {
        arr[index] = operation(arr[index]);
    }
}

// arr: array of values
// operation: a function, taking:
//              - Current accumulator (running value)
//              - Current element in the array
//            ...returns the new accumulator
// startingValue: initial value of accumulator
function reduce(arr, operation, startingValue) {
    let accumulator = startingValue;
    for (let index = 0; index < arr.length; index++) {
        accumulator = operation(accumulator, arr[index]);
    }
    return accumulator;
}

function sum(arr) {
    return reduce(arr, (accum, e) => accum + e, 0);
    // let total = 0;
    // for (let index = 0; index < arr.length; index++) {
    //     total = total + arr[index];
    // }
    // return total;
}

function product(arr) {
    return reduce(arr, (accum, e) => accum * e, 1);
    // let total = 1;
    // for (let index = 0; index < arr.length; index++) {
    //     total = total * arr[index];
    // }
    // return total;
}

    
