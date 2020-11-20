package creational;

public class BuilderDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder("Jon Doe","32897534")
                .withEmail("jon@gmail.com")
                .withNotification(true)
                .withAddress("101 Ocean Ave,ny-11101,NYC,New York")
                .build();

        System.out.println(bankAccount.getName()+ " "+bankAccount.getAccountNumber()+ " "+bankAccount.isNotification()+" "
                           +bankAccount.getAddress());
    }
}
