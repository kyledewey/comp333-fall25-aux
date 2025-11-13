// function makeRectangle(w, h) {
//     return { 'width' : w, 'height' : h };
// }

function Rectangle(w, h) {
    // this = {};
    this.width = w;
    this.height = h;
    this.getArea = function() {
        return this.width * this.height;
    };
    // return this;
}

// rectangle: object with width and height fields
// function getArea(rectangle) {
//     let temp = rectangle.width * rectangle.height;
//     return temp;
// }
