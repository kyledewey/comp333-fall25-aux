function AddThis(x) { this.x = x; }
AddThis.prototype.add = function (y) { return this.x + y; };

let withOne = new AddThis(1);
let withFive = new AddThis(5);
console.log(withOne.add(1));
console.log(withFive.add(2));

AddThis.prototype.sub = function (y) { return y - this.x; };

let temp = new AddThis();
temp.mul = function (y) {
    return y * this.x;
};
AddThis.prototype = temp;

// AddThis.prototype = {
//     'mul': function (y) {
//         return y * this.x;
//     },
//     '__proto__': AddThis.prototype
// };

let withSeven = new AddThis(7);
console.log(withSeven.mul(2)); // prints 14
console.log(withOne.mul); // prints undefined
console.log(withFive.mul); // prints undefined
