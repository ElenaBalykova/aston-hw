public interface FigurePerimeter {
    default String ciclePerimeter(double diameter) {
        return "Cicle perimeter equals " + (diameter * 3.14);
    }

    default String rectanglePerimeter(double a, double b) {
        return "Rectangle perimeter equals " + (2 * a + 2 * b);

    }

    default String trianglePerimeter(double a, double b, double c) {
        return "Triangle perimeter eguals " + (a + b + c);
    }

}
