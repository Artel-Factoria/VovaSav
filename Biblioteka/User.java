package World;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName(){
        return this.name;
    }

    public String getBirthDay(){
        return this.birthDay.toString();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    public void borrow(Book Book) {
        this.books.add(Book);
    }

    public int are() {
        int age = Period.between(this.birthDay,LocalDate.now()).getYears();

        return age;
    }
 }
