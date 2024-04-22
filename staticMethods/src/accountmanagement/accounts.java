package accountmanagement;

public class accounts {
    private String accountNo;
     private String customerName;
    private double balance;
     static int count;
public accounts(String accountNo,String customerName,double balance){
    this.accountNo=accountNo;
    this.customerName=customerName;
    this.balance=balance;
}
    public static int getCount() {
        return count; // Return the count of accounts
    }
public void deposits(double amount){
    balance += amount;
}

public  double withdrawal(double amount) {
    if (balance >= amount) {
        balance -= amount;
    } else {
        System.out.println("Insufficient Balance");
    }
    return amount;
}

    public void display () {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Name: " + customerName);
        System.out.println("Balance: $" + balance);
        count+=1;
    }


}
