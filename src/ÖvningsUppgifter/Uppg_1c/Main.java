package ÖvningsUppgifter.Uppg_1c;

import ÖvningsUppgifter.Uppg_1ab.Book;

import java.util.List;

public class Main {

    public Main(){

        List<List<Book>> mybooklists = BookUtil2.getBookList2();

        mybooklists.stream().flatMap(lista->lista.stream()).map(Book::getTitel).forEach(System.out::println);

        System.out.println("----------");

        mybooklists.stream().flatMap(lista->lista.stream()).forEach(b->System.out.println(b.getTitel()));

    }




    public static void main(String[] args) {
        Main m = new Main();
    }
}
