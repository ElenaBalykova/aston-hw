public class Product {
    private String title;
    private String date;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isBooked;

    public Product(String title, String date, String manufacturer, String country, double price, boolean isBooked) {
        this.title = title;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void productInfo() {
        System.out.println(this.title);
        System.out.println(this.date);
        System.out.println(this.manufacturer);
        System.out.println(this.country);
        System.out.println(this.price);
        System.out.println(this.isBooked);
    }

    public static void main(String[] args) {
        Product book = new Product("Book", "25-06-2025", "OOO BOOK", "Russia", 7000, true);

        book.productInfo();
    }

}
