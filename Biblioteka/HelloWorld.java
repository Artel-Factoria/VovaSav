package World;

import java.awt.print.Book;
import java.time.LocalDate;

class HelloWorld {
    public static  void main(String[] args){
        Book carmilla = new Book("Кармилла", "Шеридан Ле Фану", 270);
        AudioBook dracula = new AudioBook("Дракула", "Брэм Стокер", 30000);
        Ebook jeeves = new Ebook("Продолжайте, Дживис", "П.Г. Вудхаус", 280, "PDF");

        System.out.println(jeeves.toString());
    }
}
