package dsa;

class CreditCard  implements Cloneable{
    String customer;
    String bank;
    String account;
    double balance;
    int limit;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public CreditCard(String customer, String bank, String account,int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.balance = balance;
        this.limit = limit;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer,bank,account,limit,0);
    }


    public boolean charge(double amt){
        if(amt+balance >limit){
            return false;
        }
        balance+=amt;
        return true;
    }

    public void makePayment(double amt){
        balance-=amt;
    }

    public static  void printSummary(CreditCard card){
        System.out.println("Customer = "+ card.getCustomer());
        System.out.println("Bank = "+ card.getBank());
        System.out.println("Account = "+ card.getAccount());
        System.out.println("Balance = "+ card.getBalance());
        System.out.println("Limit = "+ card.getLimit());
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        CreditCard[] wallet = new CreditCard[3];



        wallet[0] = new CreditCard("Siby", "SBI", "123 123 123",5000);
        wallet[1] = new CreditCard("Anina", "HDFC", "345 255 765",3500);
        wallet[2] = new CreditCard("Anu", "ICICI", "345 112 123",7000);
        

        CreditCard[] test = wallet.clone();

        wallet[0].limit = 200;

        System.out.println(test[0].getLimit());

        // CreditCard cc1= new CreditCard("customer", "bank", "account", 400);
        // CreditCard cc2 = (CreditCard)cc1.clone();
        // cc1.customer = "Customer 2";
        // System.err.println(cc2.getCustomer());



        // for(int i=0;i<20;i++){
        //     wallet[0].charge(3*i);
        //     wallet[1].charge(2*i);
        //     wallet[2].charge(5*i);

        //     for(CreditCard card : wallet){
        //         CreditCard.printSummary(card);

        //         while(card.balance > 200){
        //             card.makePayment(200);
        //         }
        //         System.out.println("New Balance = "+ card.getBalance());
        //     }
        // }

    }
    

    

    

}