package json.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("Артикул")
    private String vendor;
    @JsonProperty("Название")
    private String title;
    @JsonProperty("Автор")
    private String author;
    @JsonProperty("Год")
    private String yearOfPublication;
    @JsonIgnore
    private String pages;


    public Book(String vendor, String title, String author, String year, String pages) {
        this.vendor = vendor;
        this.title = title;
        this.author = author;
        this.yearOfPublication = year;
        this.pages = pages;
    }

    public String getVendor() {return vendor;}

    public void setVendor(String vendor) {this.vendor = vendor;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    public String getYearOfPublication() {return yearOfPublication;}

    public void setYearOfPublication(String yearOfPublication) {this.yearOfPublication = yearOfPublication;}

    public String getPages() {return pages;}

    public void setPages(String pages) {this.pages = pages;}

    @Override
    public String toString() {
        return "Book[" +
                "vendor='" + vendor + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                ", pages='" + pages + '\'' +
                ']';
    }
}
