
public class NumeralItem implements Item {
    private int value;
    public NumeralItem(int value)
    {
        this.value = value;
    }
    public Item clone()
    {
        Item numeralItem ;
        numeralItem = new NumeralItem(value);
        return numeralItem;
    }
    public String toString()
    {
        return ""+value;
    }

}
