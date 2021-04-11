package quarto.model;

public class Speler {
    private String naam;
    private Ranking ranking;

    public Speler(String naam, Ranking ranking) {
        this.naam = naam;
        this.ranking = ranking;
    }

    public Blok getBlok(Blok blok) {
        return blok;
    }

    public Blok plaatsBlok(Blok blok) {
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
