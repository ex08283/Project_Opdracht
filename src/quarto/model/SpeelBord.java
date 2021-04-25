package quarto.model;

// dela
public class SpeelBord {
    private final int ROW = 4;
    private final int COLUMN = 4;
    private Blok [][] bord;

    public SpeelBord() {
        bord = new Blok[ROW][COLUMN];
    }

    public boolean isVierOpRij() {
        return true;
    }

    public boolean isGelijkSpel() { return true;}

    public Blok[][] getBord() {
        return bord;
    }

    public void placeBlok (int row, int col, Blok blok) {
        bord[row][col] = blok;
    }

}
