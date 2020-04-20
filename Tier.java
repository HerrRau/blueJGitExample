

public abstract class Tier
{
    public abstract String gibLaut();
    public abstract String gibName();
    
    public final void wieMachtDasTier() 
    {
        System.out.println(gibName()+" macht "+gibLaut());
    }
}
