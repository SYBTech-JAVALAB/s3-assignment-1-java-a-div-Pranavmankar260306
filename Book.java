class Book {
    String title;
    String author;
    double price;
    String ISBN;
    int stock;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Stock Level: " + stock);
        System.out.println("Available for purchase: " + isAvailable());
    }

    void Discount(double percentage) {
        price = price - (price * (percentage / 100));
        System.out.println("Applied " + percentage + "% discount to: " + title);
    }

    void restock(int amount) {
        stock += amount;
        System.out.println("Added " + amount + " copies to stock for: " + title);
    }

    boolean isAvailable() {
        return stock > 0;
    }
}
