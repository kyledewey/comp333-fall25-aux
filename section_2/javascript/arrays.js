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
