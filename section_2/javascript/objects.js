function makeRectangle(w, h) {
    return { 'width' : w, 'height' : h };
}

// rectangle: object with width and height fields
function getArea(rectangle) {
    return rectangle.width * rectangle.height;
}
