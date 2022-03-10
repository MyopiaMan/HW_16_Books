package by.paliakou.jaxb.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"vendor", "title", "author", "yearOfPublication"}, name = "book")
public class Book {

    private String vendor; //артикул
    private String title; //название
    private String author;
    private String yearOfPublication;

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    public String getVendor() {return vendor;}

    public void setVendor(String vendor) {this.vendor = vendor;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getYearOfPublication() {return yearOfPublication;}

    public void setYearOfPublication(String yearOfPublication) {this.yearOfPublication = yearOfPublication;}

    @Override
    public String toString() {
        return "Book{" +
                "vendor='" + vendor + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                '}';
    }
}

