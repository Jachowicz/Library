import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Book book = new Book("Name1","Description1");
        Book book2 = new Book("Name2","Description2");
        Book book3 = new Book("Name3","Description3");

        Library library = new Library();
        library.addToBookList(book);
        library.addToBookList(book2);
        library.addToBookList(book3);
        System.out.println(library);
        library.addToBookList(book);
        System.out.println(library);
    }
}
