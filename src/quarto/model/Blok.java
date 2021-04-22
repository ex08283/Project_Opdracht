package quarto.model;
//dela
public class Blok {
    public enum BlokKleur {
        DONKER("donker"), LICHT("licht");

        private String naam;

        BlokKleur(String naam) {
            this.naam = naam;
        }

        @Override
        public String toString() {
            return naam;
        }
    }

    public enum BlokVorm {
        ROND("rond"), VIERKANT("vierkant");

        private String naam;

        BlokVorm(String naam) {
            this.naam = naam;
        }

        @Override
        public String toString() {
            return naam;
        }
    }

    public enum BlokVulling {
        VOL("vol"), HOL("hol");

        private String naam;

        BlokVulling(String naam) {
            this.naam = naam;
        }

        @Override
        public String toString() {
            return naam;
        }
    }

    public enum BlokGrootte {
        GROOT("groot"), KLEIN("klein");

        private String naam;

        BlokGrootte(String naam) {
            this.naam = naam;
        }

        @Override
        public String toString() {
            return naam;
        }
    }
    //private static final Random random = new Random();

    private final BlokGrootte grootte;
    private final BlokKleur kleur;
    private final BlokVorm vorm;
    private final BlokVulling vulling;


    public Blok(BlokGrootte grootte, BlokKleur kleur, BlokVorm vorm, BlokVulling vulling) {
        this.grootte = grootte;
        this.kleur = kleur;
        this.vorm = vorm;
        this.vulling = vulling;
    }

    public BlokGrootte getGrootte() {
        return grootte;
    }

    public BlokKleur getKleur() {
        return kleur;
    }

    public BlokVorm getVorm() {
        return vorm;
    }

    public BlokVulling getVulling() {
        return vulling;
    }


    public String toString() {
        return kleur + " " + vulling + " " + grootte + " " + vorm;
    }





    /*

       public void setKaart(KaartKleur kleur, KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public void maakWillekeurigeKaart() {
        KaartKleur[] kleuren = KaartKleur.values();
        kleur = kleuren[random.nextInt(kleuren.length)];

        KaartWaarde[] waarden = KaartWaarde.values();
        waarde = waarden[random.nextInt(waarden.length)];
    }

    public String toonKaart() {
        String deWaarde = waarde.toString();
        if (waarde.ordinal() < 9) {
            deWaarde = Integer.toString(waarde.getKaartWaarde());
        }
        return kleur + " " + deWaarde;
    }

     */


}
