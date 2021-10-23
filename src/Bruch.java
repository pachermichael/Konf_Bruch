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
        return String.format("%d / %d",numerator,denominator);
    }

    public Bruch multiplicate(Bruch b2) {
        var zaehler = this.denominator * b2.getDenominator();
        var nenner = this.numerator * b2.getNumerator();

        return new Bruch(nenner,zaehler);
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        var bruch = b2.multiplicate((b3));
        return bruch.multiplicate(this);
    }
}
