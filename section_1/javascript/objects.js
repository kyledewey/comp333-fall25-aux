// function makeRectangle(w, h) {
//     return { 'width' : w, 'height' : h };
// }

function Rectangle(w, h) {
    // this = {};
    // this.__proto__ = Rectangle.prototype;
    this.width = w;
    this.height = h;
    // return this;
}

Rectangle.prototype.getArea = function() {
    return this.width * this.height;
};
Rectangle.prototype.addToWidthAndHeight = function(amount) {
    this.width += amount;
    this.height += amount;
};

// function getArea(rectangle) {
//     return rectangle.width * rectangle.height;
// }

