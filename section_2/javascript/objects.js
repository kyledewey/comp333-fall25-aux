// function makeRectangle(w, h) {
//     return { 'width' : w, 'height' : h };
// }

// let rectanglePrototype = {
//     'getArea': function() {
//         return this.width * this.height;
//     }
// };

function Shape() {}
Shape.prototype.identity = function (param) {
    return param;
};
function Rectangle(w, h) {
    // this = {};
    // this.__proto__ = Rectangle.prototype;
    this.width = w;
    this.height = h;
    // return this;
}

Rectangle.prototype = new Shape();
Rectangle.prototype.getArea = function() {
    return this.width * this.height;
};

// rectangle: object with width and height fields
// function getArea(rectangle) {
//     let temp = rectangle.width * rectangle.height;
//     return temp;
// }
