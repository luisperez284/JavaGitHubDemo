public class BankAccountTester {
    public static void main(String[] args)
    {
        BankAccount momsSavings = new BankAccount(1000);
        System.out.println("Old Balance: " +momsSavings.getBalance());
        momsSavings.addInterests(.1);
        
        System.out.println("New Balance: " +momsSavings.getBalance());
        System.out.println("Expected: 1100");
    }
}
