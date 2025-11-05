// function makeRectangle(w, h) {
//     return { 'width' : w, 'height' : h };
// }

function Rectangle(w, h) {
    // this = {};
    this.width = w;
    this.height = h;
    // return this;
}

function getArea(rectangle) {
    return rectangle.width * rectangle.height;
}

