public abstract class Tier
{
    public Tier()
    {
    }

    public abstract String gibName();
    public abstract String gibLaut();
    
    public void ausgeben() {
        System.out.println(gibName() + " macht " + gibLaut() );
    }



}
