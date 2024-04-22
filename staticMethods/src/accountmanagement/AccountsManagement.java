package accountmanagement;

public class AccountsManagement {
    public static void main(String[] args) {

        accounts account1 = new accounts("1","Aakansha",5000);
        accounts account2 = new accounts("2","Riddhi",7000);
        accounts account3 = new accounts("3","Sanvi",9000);

        account1.withdrawal(600);
        account2.deposits(500);
        account3.deposits(500);

        account1.display();
        account2.display();
        account3.display();


        System.out.println("Number of accounts created: " + accounts.getCount());


    }
}
