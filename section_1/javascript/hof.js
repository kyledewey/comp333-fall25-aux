// arr: array of some elements
// compare: function
//   -Takes one argument
//   -Returns a boolean
//   (Int) => Boolean
function printSome(arr, compare) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (compare(element)) {
            console.log(element);
        }
    }
}
    
function printAllLessThanN(arr, n) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (element < n) {
            console.log(element);
        }
    }
}

function printAllGreaterThanN(arr, n) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (element > n) {
            console.log(element);
        }
    }
}

function printAllLessThan5(arr) {
    printAllLessThanN(arr, 5);
}

function printAllLessThan10(arr) {
    printAllLessThanN(arr, 10);
}

    
