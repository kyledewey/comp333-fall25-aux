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
    // this.getArea = function() {
    //     return this.width * this.height;
    // };
    // return this;
}

// function getArea(rectangle) {
//     return rectangle.width * rectangle.height;
// }

