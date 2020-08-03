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
}