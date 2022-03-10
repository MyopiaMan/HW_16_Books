package by.paliakou.jaxb;

import by.paliakou.jaxb.model.Book;
import by.paliakou.jaxb.model.Book_List;

import javax.xml.bind.*;
import java.io.File;

public class Main {

    public static final String FILE_NAME = "./books_list.xml";

    public static Book createBook(String vendor, String title, String author, String yearOfPublication){
        Book book = new Book();
        book.setVendor(vendor);
        book.setTitle(title);
        book.setAuthor(author);
        book.setYearOfPublication(yearOfPublication);
        return book;
    }

    private static Book_List createJavaObject(){
        Book_List book_list = new Book_List();
        book_list.setName("The Greatest Books");
        book_list.getBooks().add(createBook("0-7475-3269-9",
                "Harry Potter and the Philosopher's Stone", "J. K. Rowling",
                "1997"));
        book_list.getBooks().add(createBook("978-1-84749-059-9", "Anna Karenina",
                "Lev Nikolayevich Tolstoy", "1878"));
        book_list.getBooks().add(createBook("PR6039.032 L67 1954",
                "The Lord of the Rings: The Fellowship of the Ring",
                "J. R. R. Tolkien", "1954"));
        book_list.getBooks().add(createBook("0-14-118014-5", "The Master and Margarita",
                "Mikhail Bulgakov", "1967"));
        return book_list;
    }

    public static void marshall(){
        try{
            JAXBContext context = JAXBContext.newInstance(Book_List.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createJavaObject(), new File(FILE_NAME));
        } catch (JAXBException e) {
            System.out.println("Something wrong while marshalling");
        }
    }

    public static Book_List unmarshall() throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(Book_List.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Book_List) unmarshaller.unmarshal(new File(FILE_NAME));
    }

    public static void main (String[] args) throws JAXBException{
        Main.marshall();
        System.out.println(Main.unmarshall());
        System.out.println("Reading this books!");
        System.out.println("End!");
    }



}
