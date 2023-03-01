package ÖvningsUppgifter.Uppg_1ab;

import java.util.List;

public class Main {
    List<Book> books = BookUtil.getBookList();

    public Main(){
        //uppgift1a();
        uppgift1b();
        }

    public void uppgift1a(){
    books.stream().filter(b->b.getFörfattare().equals("Agatha Christie")).forEach(b-> System.out.println(b.getTitel()));
    System.out.println("---------------");

    books.stream().filter(b->b.getFärg().equals("gul")).forEach(b-> System.out.println(b.getTitel()));
    System.out.println("---------------");

    System.out.println(books.stream().filter(b->b.getÄgare().equals("Gustaf")).count());
    System.out.println("---------------");

    books.stream().filter(b->b.getÄgare().equals("Gustaf")).forEach(b-> System.out.println(b.getTitel()));
}

    public void uppgift1b() {

        books.stream().map(Book::getTitel).forEach(b-> System.out.println(b));
        System.out.println("-------------------");
        books.stream().map(Book::getFörfattare).distinct().forEach(b-> System.out.println(b));
        System.out.println("-------------------");
        books.stream().filter(b->b.getÄgare().equals("Ilja")).map(Book::getTitel).forEach(b-> System.out.println(b));

    }




    public static void main(String[] args) {
        Main m = new Main();
    }
}
