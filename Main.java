public class Main {
    public static void main(String[] args) {
        
        Book novel = new Book();
        novel.title = "abc";
        novel.author = "abc";
        novel.price = 100;
        novel.ISBN = "3357";
        novel.stock = 5;

        Book textbook = new Book();
        textbook.title = "Java";
        textbook.author = "jp";
        textbook.price = 120.00;
        textbook.ISBN = "ABC-12345";
        textbook.stock = 0; // Currently out of stock
        
        

        System.out.println("--- Initial Inventory ---");
        novel.displayInfo();
        textbook.displayInfo();

        novel.Discount(10); 
        textbook.restock(12);

        System.out.println("\n--- Updated Inventory ---");
        novel.displayInfo();
        textbook.displayInfo();
    }
}

    
