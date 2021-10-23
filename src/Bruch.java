public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    //Erstellt eine neue Instanz von Bruch
    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Nenner
    public int getNumerator() {
        return numerator;
    }

    //Zähler
    public int getDenominator() {
        return denominator;
    }

    //Methode liefert den Bruch als Dezimalwert zurück
    public double toDecimal() {
        return (double)denominator / (double)numerator;
    }

    //Methode liefert den Bruch als Text zurück. Format: Z / N
    public String print() {
        return String.format("%d / %d",denominator,numerator);
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */


        return null;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3

        return null;
    }
}
