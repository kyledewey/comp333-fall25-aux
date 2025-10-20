function printAllLessThanN(arr, n) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (element < n) {
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
