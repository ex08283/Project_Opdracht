package quarto.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static quarto.model.Blok.BlokFilling;
import static quarto.model.Blok.BlokShape;
import static quarto.model.Blok.BlokColor;
import static quarto.model.Blok.BlokSize;
//dela
public class BlokkenBox {
    private final Set<Blok> blokSet;

    public BlokkenBox() {
        this.blokSet = new HashSet<>();
        maakBlokken();

    }
    //
    private void maakBlokken() {
        BlokFilling[] fillings = BlokFilling.values();
        BlokColor[] colors = BlokColor.values();
        BlokShape[] shapes = BlokShape.values();
        BlokSize[] sizes = BlokSize.values();
        for (BlokSize size : sizes) {
            for (BlokColor color : colors) {
                for (BlokShape shape : shapes) {
                    for (BlokFilling filling : fillings) {
                        Blok blok = new Blok(size, color, shape, filling );
                        blokSet.add(blok);
                    }
                }
            }
        }
    }

    public Set<Blok> getBlokSet() {
        return blokSet;
    }


    public void remove(Blok blok) {
        blokSet.removeIf(next -> next.equals(blok));
    }
}
