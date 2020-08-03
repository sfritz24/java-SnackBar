package snackBarApp;

public class Customer
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //getters
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCashOnHand()
    {
        return cashOnHand;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
}