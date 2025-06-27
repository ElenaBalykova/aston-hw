public class Triangle implements FigureArea, FigurePerimeter {
    private String backgroundColor;
    private String borderColor;

    public Triangle( String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return "Triangle background color: " + backgroundColor;
    }
    private String getBorderColor() {
        return "Triangle border color: " + borderColor;
    }

    public static void main(String[] args) {
        Triangle one = new Triangle("white", "red");

        System.out.println(one.getBackgroundColor());
        System.out.println(one.getBorderColor());
        System.out.println(one.triangleArea(4,5));
        System.out.println(one.trianglePerimeter(5,8,9));
    }
}