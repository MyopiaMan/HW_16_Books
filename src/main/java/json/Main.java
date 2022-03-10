package json;


import com.fasterxml.jackson.databind.ObjectMapper;
import json.model.Book;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_NAME = "./books.json";

    private static List<Book> toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return (List<Book>) mapper.readValue(new File(FILE_NAME), List.class);
    }

    private static void toJSON(List<Book> books) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(FILE_NAME), books);
        System.out.println("JSON created!");
    }
    public static void main (String[] args) throws IOException{
        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book("0-7475-3269-9",
                "Harry Potter and the Philosopher's Stone", "J. K. Rowling",
                "1997", "223"));
        booksList.add(new Book("978-1-84749-059-9", "Anna Karenina",
                "Lev Nikolayevich Tolstoy", "1878", "864"));
        booksList.add(new Book("PR6039.032 L67 1954",
                "The Lord of the Rings: The Fellowship of the Ring",
                "J. R. R. Tolkien", "1954", "423"));
        booksList.add(new Book("0-14-118014-5", "The Master and Margarita",
                "Mikhail Bulgakov", "1967", "unknown"));
        toJSON(booksList);
        System.out.println("Записали");
        List<Book> books = toJavaObject();
        System.out.println(books);
    }


}
