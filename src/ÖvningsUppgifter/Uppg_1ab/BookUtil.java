package ÖvningsUppgifter.Uppg_1ab;

import java.util.Arrays;
import java.util.List;

public class BookUtil {

    public static List<Book> getBookList(){

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
        Book b21 = new Book("Du sköna nya värld","Aldous Huxley","Roman","rosa",4,"Karin",true);
        Book b22 = new Book("Asterix och hans tappra galler","René Goscinny och Albert Uderzo","Klassiker","röd",3,"Gustaf",true);
        Book b23 = new Book("Den skalliga primadonnan","Eugène Ionesco","Klassiker","turkos",1,"Frank",true);
        Book b24 = new Book("Gösta Berlings saga","Selma Lagerlöf","Klassiker","gul",3,"Bosse",false);
        Book b25 = new Book("Jerusalem","Selma Lagerlöf","Klassiker","grön",2,"Karin",true);
        Book b26 = new Book("Odysseus","James Joyce","Fantasy","rosa",1,"Lussan",false);
        Book b27 = new Book("Bannlyst","Selma Lagerlöf","Klassiker","rosa",2,"Ninni",false);
        Book b28 = new Book("Körkarlen","Selma Lagerlöf","Klassiker","turkos",4,"Efraim",true);
        Book b29 = new Book("Husaren på taket","Jean Giono","Historia","grön",1,"Egil",true);
        Book b30 = new Book("Herrens sköna","Albert Cohen","Klassiker","grön",4,"Ilja",false);
        Book b31 = new Book("Hundra år av ensamhet","Gabriel García Márquez ","Biografi","grön",2,"Johanna",false);
        Book b32 = new Book("Stormen och vreden","William Faulkner ","Historia","rosa",2,"Frank",false);
        Book b33 = new Book("Thérèse","François Mauriac ","Deckare","grön",2,"Ninni",false);
        Book b34 = new Book("Slottet","Franz Kafka","Fantasy","röd",3,"Frank",true);
        Book b35 = new Book("Brevet till Fadern","Franz Kafka","Historia","grön",3,"Cecilia",false);
        Book b36 = new Book("Domen","Franz Kafka","Historia","rosa",3,"Gustaf",true);
        Book b37 = new Book("Lady Chatterleys älskare","D.H. Lawrence","Historia","gul",5,"Gustaf",true);
        Book b38 = new Book("Bergtagen","Thomas Mann ","Biografi","grön",2,"Ilja",true);
        Book b39 = new Book("Ett moln på min himmel","Françoise Sagan","Klassiker","blå",4,"Cecilia",true);
        Book b40 = new Book("Havets tystnad","Jean Bruller (Vercors)","Klassiker","turkos",5,"Efraim",false);
        Book b41 = new Book("Livet en bruksanvisning","Georges Perec","Historia","gul",4,"Bosse",false);
        Book b42 = new Book("Baskervilles hund","Arthur Conan Doyle","Biografi","rosa",4,"Gustaf",true);
        Book b43 = new Book("Klockorna","Agatha Christie","Roman","rosa",1,"Karin",false);
        Book b44 = new Book("Tredje flickan","Agatha Christie","Historia","röd",3,"Egil",true);
        Book b45 = new Book("Gropen","Agatha Christie","Biografi","blå",2,"Ilja",true);
        Book b46 = new Book("Föraktet","Alberto Moravia","Historia","rosa",2,"Hannes",true);
        Book b47 = new Book("Dolken från Tunis","Agatha Christie","Fantasy","blå",3,"Gustaf",false);
        Book b48 = new Book("Nadja","André Breton","Biografi","turkos",3,"Ilja",false);


        return Arrays.asList(b1,b2,	b3,	b4,	b5,	b6,	b7,	b8,	b9,	b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,
                b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48);
    }
}
