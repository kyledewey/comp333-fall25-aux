// arr: array of values
// compare: a function
//   -Takes a value
//   -Returns a boolean
function printSome(arr, compare) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (compare(element)) {
            console.log(element);
        }
    }
}

function printAllLessThanN(arr, n) {
    printSome(arr, (e) => e < n);

    // printSome(arr,
    //           function (e) {
    //               return e < n;
    //           });
}

function printAllGreaterThanN(arr, n) {
    printSome(arr, (e) => e > n);

    // let temp = function (e) {
    //     return e > n;
    // };
    // printSome(arr, temp);
}

function printAllLessThan5(arr) {
    printAllLessThanN(arr, 5);
}

function printAllLessThan10(arr) {
    printAllLessThanN(arr, 10);
}
