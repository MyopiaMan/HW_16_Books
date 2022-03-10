package by.paliakou.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlType(propOrder = {"name", "books"}, name = "books list")
public class Book_List {

    private String name;
    private List<Book> books = new ArrayList<>();

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @XmlElement(name = "book")
    @XmlElementWrapper(name = "books")

    public List<Book> getBooks() {return books;}

    public void setBooks(List<Book> books) {this.books = books;}

    @Override
    public String toString() {
        return "Book_List{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
