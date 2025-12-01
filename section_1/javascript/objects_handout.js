function Base() {}
function Sub1() {}
function Sub2() {}

Base.prototype.method = function() {
    console.log("base");
};
Sub1.prototype = new Base();
Sub2.prototype = new Base();
Sub1.prototype.method = function() {
    console.log("sub1");
};

let base = new Base();
let sub1 = new Sub1();
let sub2 = new Sub2();
base.method(); // base
sub1.method(); // sub1
sub2.method(); // base
console.log(base instanceof Base); // true
console.log(sub1 instanceof Base); // true
console.log(sub2 instanceof Base); // true
