package ÖvningsUppgifter.Uppg_1ab;

public class Book {

    private String titel;
    private String författare;
    private String genre;
    private String färg;
    private int betyg;
    private String ägare;
    private boolean faktaEllerFiktion;


    public Book(String titel, String författare, String genre, String färg, int betyg, String ägare, boolean faktaEllerFiktion) {
        this.titel = titel;
        this.författare = författare;
        this.genre = genre;
        this.färg = färg;
        this.betyg = betyg;
        this.ägare = ägare;
        this.faktaEllerFiktion = faktaEllerFiktion;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getFörfattare() {
        return författare;
    }

    public void setFörfattare(String författare) {
        this.författare = författare;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public int getBetyg() {
        return betyg;
    }

    public void setBetyg(int betyg) {
        this.betyg = betyg;
    }

    public String getÄgare() {
        return ägare;
    }

    public void setÄgare(String ägare) {
        this.ägare = ägare;
    }

    public boolean isFaktaEllerFiktion() {
        return faktaEllerFiktion;
    }

    public void setFaktaEllerFiktion(boolean faktaEllerFiktion) {
        this.faktaEllerFiktion = faktaEllerFiktion;
    }
}
