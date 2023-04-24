package db;

import java.util.ArrayList;

public class DBManager {
    public static final ArrayList<Book> books = new ArrayList<>();
    public static int id = 6;

    static {
        books.add(new Book(1,"Harry Potter", "Joane", "Fantasy", 5000));
        books.add(new Book(2,"Rich Dad", "Robert", "Business", 7000));
        books.add(new Book(3,"Theory All", "Stiven", "Science", 1000));
        books.add(new Book(4,"Abay Zholy", "Auezov", "Roman", 9000));
        books.add(new Book(5,"Goal", "Succesful", "Business", 3000));
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }
    public static void addBook(Book book){
        book.setId(id);
        books.add(book);
        id++;
    }
}
