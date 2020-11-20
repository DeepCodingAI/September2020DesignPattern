package creational;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean notification;
    private String address;

    public BankAccount(){}

    public BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.notification = builder.notification;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public static class BankAccountBuilder{
        private String name;
        private String accountNumber;
        private String email;
        private boolean notification;
        private String address;

        public BankAccountBuilder(){}
        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public BankAccountBuilder withNotification(boolean notification){
            this.notification = notification;
            return this;
        }

        public BankAccountBuilder withAddress(String address){
            this.address = address;
            return this;
        }
        public BankAccount build(){
            return new BankAccount(this);
        }
    }
}
