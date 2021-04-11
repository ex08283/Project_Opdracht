package quarto.model;

import java.util.HashSet;
import java.util.Set;

import static quarto.model.Blok.BlokVulling;
import static quarto.model.Blok.BlokVorm;
import static quarto.model.Blok.BlokKleur;
import static quarto.model.Blok.BlokGrootte;

public class BlokkenBox {
    private final Set<Blok> blokSet;

    public BlokkenBox() {
        this.blokSet = new HashSet<>();

    }
    //
    private void maakBlokken() {
        BlokVulling[] vullings = BlokVulling.values();
        BlokKleur[] kleuren = BlokKleur.values();
        BlokVorm[] vorms = BlokVorm.values();
        BlokGrootte[] groottes = BlokGrootte.values();
        for (BlokGrootte grootte : groottes) {
            for (BlokKleur kleur : kleuren) {
                for (BlokVorm vorm : vorms) {
                    for (BlokVulling vulling : vullings) {
                        Blok blok = new Blok(grootte, kleur, vorm,vulling );
                        blokSet.add(blok);
                    }
                }
            }
        }
    }



}
