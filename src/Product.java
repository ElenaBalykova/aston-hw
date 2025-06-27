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

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("LG 75 Ultra", "02.03.2025", "LG Corp.", "Korea", 7599, false);
        productsArray[2] = new Product("Philips 43 Ultra", "04.04.2025", "TP Vision", "Netherlands", 9599, true);
        productsArray[3] = new Product("Nokia n73", "02.01.2025", "Nokia", "Finland", 2599, false);
        productsArray[4] = new Product("Iphone 13 mini", "12.02.2025", "Apple", "USA", 55599, true);
    }

}
