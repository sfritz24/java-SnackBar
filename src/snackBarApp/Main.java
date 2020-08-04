package snackBarApp;

public class Main
{
    private static void workWithData()
    {
        System.out.println("Snack Bar App");
        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        //String name, int quanity, double cost, int vendingMachineId
        Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vm2.getId());

        //String name, double cashOnHand
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        double problem1 = s4.totalCost(3);
        c1.buySnacks(problem1);
        s4.buySnack(3);
        System.out.println(c1);
        System.out.println(s4);

        double problem2 = s3.totalCost(1);
        c1.buySnacks(problem2);
        s3.buySnack(1);
        System.out.println(c1);
        System.out.println(s3);

        double problem3 = s4.totalCost(2);
        c2.buySnacks(problem3);
        s4.buySnack(2);
        System.out.println(c2);
        System.out.println(s4);
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}