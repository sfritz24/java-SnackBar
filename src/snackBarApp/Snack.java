package snackBarApp;

public class Snack
{
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quanity;
    private double cost;
    private int vendingMachineId;

    //getters
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getQuanity()
    {
        return quanity;
    }
    public double getCost()
    {
        return cost;
    }
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    //other methods
    public void addQuanity(int num1)
    {
        this.quanity = this.quanity + num1;
    }
    public void buySnack(int num2)
    {
        this.quanity = this.quanity - num2;
    }
    public double totalCost(int quanity)
    {
        return quanity * cost;
    }

    //constructor
    public Snack(String name, int quanity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quanity = quanity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //override
    // public String toString()
    // {
    //     return "Quanity of snack " + id + " is " + quanity;
    // }
}