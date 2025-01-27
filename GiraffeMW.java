
/**
 * Beschreiben Sie hier die Klasse Giraffe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GiraffeMW
{
    private int Halslänge;
    private int Beinlänge;
    private int Gewicht;
    public GiraffeMW()
    {
        Halslänge = 3;
        Beinlänge = 2;
        Gewicht = 90;
    }
    public GiraffeMW(int HalslängeNeu, int BeinlängeNeu, int GewichtNeu)
    {
        Halslänge = HalslängeNeu;
        Beinlänge = BeinlängeNeu;
        Gewicht = GewichtNeu;
    }
    public void setzeHalslänge(int a)
    {
        Halslänge = a;
    }
    public void setzeBeinlänge(int b)
    {
        Beinlänge = b;
    }
    public void setzeGewicht(int c)
    {
        Gewicht = c;
    }
    public int gebeHalslänge()
    {
        return Halslänge;
    }
    public int gebeBeinlänge()
    {
        return Beinlänge;
    }
    public int gebeGewicht()
    {
        return Gewicht;
    }
}
