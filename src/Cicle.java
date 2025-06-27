public class Cicle implements FigureArea, FigurePerimeter {
    private String backgroundColor;
    private String borderColor;

    public Cicle( String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return "Cicle background color: " + backgroundColor;
    }
    private String getBorderColor() {
        return "Cicle border color: " + borderColor;
    }

    public static void main(String[] args) {
        Cicle one = new Cicle("black", "white");

        System.out.println(one.getBackgroundColor());
        System.out.println(one.getBorderColor());
        System.out.println(one.cicleArea(4));
        System.out.println(one.ciclePerimeter(8));
    }
}
