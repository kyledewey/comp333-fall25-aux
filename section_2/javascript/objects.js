// function makeRectangle(w, h) {
//     return { 'width' : w, 'height' : h };
// }

let rectanglePrototype = {
    'getArea': function() {
        return this.width * this.height;
    }
};

function Rectangle(w, h) {
    // this = {};
    this.width = w;
    this.height = h;
    this.__proto__ = rectanglePrototype;
    // return this;
}

// rectangle: object with width and height fields
// function getArea(rectangle) {
//     let temp = rectangle.width * rectangle.height;
//     return temp;
// }
