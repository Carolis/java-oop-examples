package pkg002;

public class Main {

    public static void main(String[] args) {
        
       System.out.println("First Object:");
        
       Book book1 = new Book();
       book1.description = "My first book";
       book1.status();
       
       System.out.println("Second Object:");
       Book book2 = new Book();
       book2.description = "My second book";
       book2.status();
    }
    
}
