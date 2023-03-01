package ÖvningsUppgifter.Uppg_1c;

import ÖvningsUppgifter.Uppg_1ab.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BookUtil2 {

    public static List<List<Book>> getBookList2(){

        Book b1 = new Book("Främlingen","Albert Camus ","Fantasy","grön",5,"Lussan",false);
        Book b2 = new Book("På spaning efter den tid som flytt","Marcel Proust","Deckare","rosa",5,"Bosse",false);
        Book b3 = new Book("Processen","Franz Kafka","Historia","turkos",2,"Cecilia",false);
        Book b4 = new Book("Lille prinsen","Antoine de Saint-Exupéry","Klassiker","grön",3,"Monika",true);
        Book b5 = new Book("Människans lott","André Malraux","Historia","grön",1,"Johanna",true);

        Book b6 = new Book("Resa till nattens ände","Louis-Ferdinand Céline","Deckare","gul",3,"Gustaf",true);
        Book b7 = new Book("Vredens druvor","John Steinbeck ","Biografi","röd",3,"AnnaLena",false);
        Book b8 = new Book("Klockan klämtar för dig","Ernest Hemingway ","Fantasy","röd",4,"Beata",true);
        Book b9 = new Book("Farväl till vapnen","Ernest Hemingway ","Biografi","gul",2,"Bosse",false);
        Book b10 = new Book("Den gamle och havet","Ernest Hemingway ","Fantasy","grön",2,"AnnaLena",false);

        Book b11 = new Book("Det andra könet","Simone de Beauvoir","Deckare","blå",4,"Gustaf",false);
        Book b12 = new Book("I väntan på Godot","Samuel Beckett ","Fantasy","röd",1,"Monika",false);
        Book b13 = new Book("Varat och intet","Jean-Paul Sartre ","Roman","gul",5,"Frank",false);
        Book b14 = new Book("Pesten","Albert Camus ","Klassiker","grön",2,"Ilja",false);
        Book b15 = new Book("GULAG-arkipelagen","Aleksandr Solzjenitsyn ","Klassiker","rosa",4,"Ninni",false);

        Book b16 = new Book("Ord","Jacques Prévert","Deckare","röd",5,"Ninni",true);
        Book b17 = new Book("Alcools (franska)","Guillaume Apollinaire","Historia","grön",4,"Ilja",true);
        Book b18 = new Book("Fallet","Albert Camus ","Biografi","blå",1,"Karin",false);
        Book b19 = new Book("Anne Franks dagbok","Anne Frank","Historia","grön",1,"Karin",true);
        Book b20 = new Book("Spillror av paradiset","Claude Lévi-Strauss","Klassiker","rosa",1,"AnnaLena",false);

        List<Book> books1 = new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5));
        List<Book> books2 = new ArrayList<>(Arrays.asList(b6,b7,b8,b9,b10));
        List<Book> books3 = new ArrayList<>(Arrays.asList(b11,b12,b13,b14,b15));
        List<Book> books4 = new ArrayList<>(Arrays.asList(b16,b17,b18,b19,b20));

        return Arrays.asList(books1, books2, books3, books4);
    }


}
