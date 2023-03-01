package ÖvningsUppgifter.Uppg_1d;

import ÖvningsUppgifter.Uppg_1ab.Book;
import ÖvningsUppgifter.Uppg_1ab.BookUtil;

import java.text.Collator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    List<Book> books = BookUtil.getBookList();

    public void uppgift1d(){
        double medelbetyg = (double)books.stream().map(Book::getBetyg).reduce( 0,(sum,elem)->sum+elem)/books.size();
        System.out.println(medelbetyg);

        System.out.println("------");

        System.out.println(books.stream().map(Book::getTitel).reduce("",(a,s)->a+s+","));
    }

    public void uppgift1e(){
        System.out.println(books.stream().map(Book::getBetyg).mapToInt(Integer::valueOf).summaryStatistics().getAverage());

        long antal = books.stream().filter(b->b.getÄgare().equals("Gustaf")).filter(b->b.getFärg().equals("rosa")).count();
        System.out.println(antal);

        boolean finns = books.stream().map(Book::getFörfattare).anyMatch(f->f.equalsIgnoreCase("Selma Lagerlöf"));
        System.out.println(finns);
    }


    public void uppgift1f(){

        books.stream().sorted((r1,r2)->((Integer)r1.getBetyg()).compareTo(r2.getBetyg())).forEach(b-> System.out.println("Betyg: "+b.getBetyg()+"- "+b.getTitel()));

        Collator c = Collator.getInstance(new Locale("sv","SE"));
        books.stream().map(Book::getTitel).sorted(c).forEach(b-> System.out.println(b));

        System.out.println("------eller------");
        books.stream().map(Book::getTitel).sorted(c).forEach(System.out::println);

    }

    public void uppgift1g(){
        System.out.println(books.stream().map(Book::getTitel).collect(Collectors.joining(",")));
    }






    public Main() {
       // uppgift1d();
       // uppgift1e();
        //uppgift1f();
        uppgift1g();
    }

    public static void main(String[] args) {
        Main m = new Main();
    }

}
