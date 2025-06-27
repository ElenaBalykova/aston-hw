public interface FigureArea {
    default String cicleArea (double radius){
        return "Circle area equals " + 3.14 * Math.pow(radius, 2);
    }

    default String rectangleArea (double a, double b){
        return "Rectangle  area equals " + a * b;
    }
    default String triangleArea(double a, double h) {
        return "Triangle area eguals " + (0.5 * a * h);
    }
}
