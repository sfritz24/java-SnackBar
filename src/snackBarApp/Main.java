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
        System.out.println("Customer " + c1.getId() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quanity of snack " + s4.getId() + " is " + s4.getQuanity());

        double problem2 = s3.totalCost(1);
        c1.buySnacks(problem2);
        s3.buySnack(1);
        System.out.println("Customer " + c1.getId() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quanity of snack " + s3.getId() + " is " + s3.getQuanity());

        double problem3 = s4.totalCost(2);
        c2.buySnacks(problem3);
        s4.buySnack(2);
        System.out.println("Customer " + c2.getId() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quanity of snack " + s4.getId() + " is " + s4.getQuanity());

        c1.addCash(10);
        System.out.println("Customer " + c1.getId() + " cash on hand $" + c1.getCashOnHand());

        double problem5 = s2.totalCost(1);
        c1.buySnacks(problem5);
        s2.buySnack(1);
        System.out.println("Customer " + c1.getId() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quanity of snack " + s2.getId() + " is " + s2.getQuanity());

        s3.addQuanity(12);
        System.out.println("Quanity of snack " + s3.getId() + " is " + s3.getQuanity());

        double problem7 = s3.totalCost(3);
        c2.buySnacks(problem7);
        s3.buySnack(3);
        System.out.println("Customer " + c2.getId() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quanity of snack " + s3.getId() + " is " + s3.getQuanity());

        System.out.println("Snack: " + s1.getName());
        System.out.println("Vending Machine: " + vm1.getName());
        System.out.println("Quanity: " + s1.getQuanity());
        System.out.println("Total Cost: $" + s1.totalCost(s1.getQuanity()));

        System.out.println("Snack: " + s2.getName());
        System.out.println("Vending Machine: " + vm1.getName());
        System.out.println("Quanity: " + s2.getQuanity());
        System.out.println("Total Cost: $" + s2.totalCost(s2.getQuanity()));

        System.out.println("Snack: " + s3.getName());
        System.out.println("Vending Machine: " + vm1.getName());
        System.out.println("Quanity: " + s3.getQuanity());
        System.out.println("Total Cost: $" + s3.totalCost(s3.getQuanity()));

        System.out.println("Snack: " + s4.getName());
        System.out.println("Vending Machine: " + vm2.getName());
        System.out.println("Quanity: " + s4.getQuanity());
        System.out.println("Total Cost: $" + s4.totalCost(s4.getQuanity()));

        System.out.println("Snack: " + s5.getName());
        System.out.println("Vending Machine: " + vm2.getName());
        System.out.println("Quanity: " + s5.getQuanity());
        System.out.println("Total Cost: $" + s5.totalCost(s5.getQuanity()));
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}