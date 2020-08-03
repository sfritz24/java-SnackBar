package snackBarApp;

public class Main
{
    private static void workWithData()
    {
        System.out.println("Snack Bar App");
        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}