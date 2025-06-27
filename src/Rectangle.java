public class Rectangle implements FigureArea, FigurePerimeter {
    private String backgroundColor;
    private String borderColor;

    public Rectangle( String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return "Rectangle background color: " + backgroundColor;
    }
    private String getBorderColor() {
        return "Rectangle border color: " + borderColor;
    }

    public static void main(String[] args) {
        Rectangle one = new Rectangle("black", "red");

        System.out.println(one.getBackgroundColor());
        System.out.println(one.getBorderColor());
        System.out.println(one.rectangleArea(4, 5));
        System.out.println(one.rectanglePerimeter(5,8));
    }
}