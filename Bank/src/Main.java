public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("26675462362", 76245.38);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getAccountNumber());

        bankAccount.withdraw(7245.88);
        System.out.println(bankAccount.getBalance());
    }
}
