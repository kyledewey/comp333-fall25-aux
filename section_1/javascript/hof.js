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

function example(arr) {
    let someValue = 0;
    printSome(arr,
              function (someElement) {
                  someValue++;
                  return true;
              });
    console.log("---");
    console.log(someValue);
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
    // printSome(arr,
    //           function (e) {
    //               return e > n;
    //           });
}

function printAllLessThan5(arr) {
    printAllLessThanN(arr, 5);
}

function printAllLessThan10(arr) {
    printAllLessThanN(arr, 10);
}

function callMe(foo) {
    foo();
}

function printHello() {
    console.log("hello");
}

function printBye() {
    console.log("bye");
}

function indirectIf(statement, func1, func2) {
    (statement) ? func1() : func2();
    // if (statement) {
    //     func1();
    // } else {
    //     func2();
    // }
}

function indirectDoWhile(func1, func2) {
    func2();
    if (func1()) {
        indirectDoWhile(func1, func2);
    }
}

function indirectWhile(condition, body) {
    if (condition()) {
        body();
        indirectWhile(condition, body);
    }
}

function example2() {
    let x = 0;
    indirectWhile(() => x < 10, () => x++);
    return x;
}

function delayedAdd(x) {
    return (y) => x + y;
}
