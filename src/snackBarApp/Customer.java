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

    //other methods
    public double addCash(double num1)
    {
        return cashOnHand + num1;
    }
    public double buySnacks(double num2)
    {
        return cashOnHand - num2;
    }

    //constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //override
    public String toString()
    {
        return "Customer " + id + " cash on hand is $" + cashOnHand;
    }
}