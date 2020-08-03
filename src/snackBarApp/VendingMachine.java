package snackBarApp;

public class VendingMachine
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;

    //getters
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
}