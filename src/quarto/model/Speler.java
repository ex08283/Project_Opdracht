package quarto.model;
//dela
public class Speler {
    private String naam;
    private Ranking ranking;
    Blok blok;

    public Speler(String naam, Ranking ranking) {
        this.naam = naam;
        this.ranking = ranking;
    }

    public void chooseBlok(Blok blok) {
        this.blok = blok;
    }

    public Blok getBlok() {
        return blok;
    }

    /*

    public Blok getBlok(Blok.BlokGrootte grootte, Blok.BlokKleur kleur, Blok.BlokVorm vorm, Blok.BlokVulling vulling) {
        Blok blok = new Blok(grootte, kleur, vorm, vulling);
        blokSet.remove(blok);
        return blok;
    }

     */

    public void getScore() {
    }
}
