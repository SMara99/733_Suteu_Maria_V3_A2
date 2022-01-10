public class Employees {
    String name;
    int lohn;
    int anzahlStudenten;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLohn() {
        return lohn;
    }

    public void setLohn(int lohn) {
        this.lohn = lohn;
    }

    public int getAnzahlStudenten() {
        return anzahlStudenten;
    }

    public void setAnzahlStudenten(int anzahlStudenten) {
        this.anzahlStudenten = anzahlStudenten;
    }

    public Employees(String name, int lohn, int anzahlStudenten) {
        this.name = name;
        this.lohn = lohn;
        this.anzahlStudenten = anzahlStudenten;
    }
}
