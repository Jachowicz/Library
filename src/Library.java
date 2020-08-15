import java.util.*;

public class Library {
    private ArrayList<Book> bookList;

    public ArrayList<Book> getBookList() {
        return bookList;
    }
    public Library(ArrayList<Book> bookList){
        this.bookList = bookList;
    }
    public Library(){
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> addToBookList(Book book){
        this.bookList.add(book);
        return this.bookList;
    }

    @Override
    public String toString() {
        return " " + getBookList()+ " ";
    }
}

