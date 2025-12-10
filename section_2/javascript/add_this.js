function AddThis(x) { this.x = x; }
AddThis.prototype.add = function (y) { return this.x + y; };

let withOne = new AddThis(1);
let withFive = new AddThis(5);
console.log(withOne.add(1));  // 2
console.log(withFive.add(2)); // 7

AddThis.prototype.sub = function (y) { return y - this.x; };

let temp = new AddThis();
temp.mul = function (y) { return y * this.x; };
AddThis.prototype = temp;

// let temp = {
//     '__proto__': AddThis.prototype,
//     'mul': function (y) {
//         return y * this.x;
//     }
// };
// AddThis.prototype = temp;

let withSeven = new AddThis(7);
let withNine = new AddThis(9);
