public class Katze extends Tier
{
    String name;
    int groesse;
    int gewicht;

    public Katze()
    {
        name = "Mathilda";
        groesse = 5;
        gewicht = 7;
    }

    public Katze(String naNeu, int grNeu, int geNeu)
    {
        name = naNeu;
        groesse = grNeu;
        gewicht = geNeu;
    }

    public void setzeName(String s) { name = s; }

    public void setzeGroesse(int i) { groesse = i; }

    public void setzeGewicht(int i) { gewicht = i; }

    public String gibName() { return name; }

    public int gibGroesse() { return groesse; } 

    public int gibgewicht() { return gewicht; }

    public String gibLaut() { return "meow"; }

}

