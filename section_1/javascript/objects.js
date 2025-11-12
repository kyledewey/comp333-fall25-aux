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

// function getArea(rectangle) {
//     return rectangle.width * rectangle.height;
// }

