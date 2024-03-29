package Servlets;

import db.Book;
import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-music")
public class AddMusicServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("book_name");
        String author = request.getParameter("book_author");
        String genre = request.getParameter("book_genre");
        String price = request.getParameter("book_price");

        double bookPrice = Double.parseDouble(price);

        Book book = new Book();
        book.setName(name);
        book.setPrice(bookPrice);
        book.setAuthor(author);
        book.setGenre(genre);

        DBManager.addBook(book);
        response.sendRedirect("/");

    }

}
