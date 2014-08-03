
public class StringItem implements Item {
    private String value;
    public Item clone()
    {
        Item stringItem ;
        stringItem = new StringItem(value);
        return stringItem;
    }
    public String toString()
    {
        return ""+value;
    }
    public StringItem(String value)
    {
        this.value=value;
    }
}
