package pkg002;

public class Book {
    String description;
    private int pageNumber;
    int maxPageNumber;
    
    Book() {
        maxPageNumber = 200;
    }
    
    void setPageNumber(int pageNumber){
        if(pageNumber > maxPageNumber){
            System.out.println("Max page number exceeded");
        }
        else {
            this.pageNumber = pageNumber;
        }
    }
    
    void status(){
        System.out.println("Name: " + description);
        System.out.println("Number of pages: " + pageNumber);
        System.out.println("Max number of pages: " + maxPageNumber);
    }
}

