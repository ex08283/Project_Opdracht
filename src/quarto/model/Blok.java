package quarto.model;

import java.util.Objects;

//dela
public class Blok {
    public enum BlokColor { DARK, LIGHT}

    public enum BlokShape {ROUND, SQUARE}

    public enum BlokFilling {FULL, EMPTY}

    public enum BlokSize { BIG, SMALL}
    //private static final Random random = new Random();
    private final BlokSize size;
    private final BlokColor color;
    private final BlokShape shape;
    private final BlokFilling filling;

    public Blok(BlokSize size, BlokColor color, BlokShape shape, BlokFilling filling) {
        this.size = size;
        this.color = color;
        this.shape = shape;
        this.filling = filling;
    }
    public BlokSize getSize() {
        return size;
    }
    public BlokColor getColor() {
        return color;
    }
    public BlokShape getShape() {
        return shape;
    }
    public BlokFilling getFilling() {
        return filling;
    }

    public String toString() {
        return size + " " + color + " " + shape + " " + filling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blok blok = (Blok) o;
        return getSize() == blok.getSize() &&
                getColor() == blok.getColor() &&
                getShape() == blok.getShape() &&
                getFilling() == blok.getFilling();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getColor(), getShape(), getFilling());
    }
}
