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
    public void addCash(double num1)
    {
        this.cashOnHand = this.cashOnHand + num1;
    }
    public void buySnacks(double num2)
    {
        this.cashOnHand = this.cashOnHand - num2;
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