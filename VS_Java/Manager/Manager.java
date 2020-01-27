class Account{
    int accountNumber;
    String holderName;
    float balance;

    public Account(){
        accountNumber = 0;
        holderName = null;
        balance = 0.0f;
    }
    public Account(int a, String s, float b){
        accountNumber = a;
        holderName = s;
        balance = b;
    }
    public void updateBalance(int i){
        balance = i;
    }
    public void display() {
        System.out.println("The account number is: " + accountNumber);
        System.out.println("The account holder's name is: " + holderName);
        System.out.println("The account balance is: " + balance);
    }
}

class SavingsAccount extends Account {
    float interestRate = 0.0f;

    public SavingsAccount(float f, int a, String s, float b) {
        interestRate = f;
        accountNumber = a;
        holderName = s;
        balance = b;
    }

    public void setInterestRate(float f) {
        interestRate = f;
    }

    public float calculateYearlyInterest() {
        return balance * interestRate * (0.01f);
    }

    public void display() {
        super.display();
        System.out.println("The yearly interest for this account is: " + interestRate + "\n");
    }
}

class CurrentAccount extends Account{
    public CurrentAccount(int a, String s, float b){
        accountNumber = a;
        holderName = s;
        balance = b;
    }
    public void display(){
        super.display();
        System.out.println();
    }
}

class Manager{
    Account[] a;
    public static void main(String[] args){
        SavingsAccount[] s = new SavingsAccount[2];
        CurrentAccount[] c = new CurrentAccount[3];
        s[0] = new SavingsAccount(5.0f, 1, "xyx", 50000f);
        s[1] = new SavingsAccount(7.0f, 2, "abc", 45000f);
        c[0] = new CurrentAccount(3, "dfg", 35000f);
        c[1] = new CurrentAccount(4, "tyg", 75000f);
        c[2] = new CurrentAccount(5, "pig", 25000f);
        System.out.println("The Yearly interest for the account with account no: " + s[0].accountNumber + " is: " + s[0].calculateYearlyInterest());
        System.out.println("The Yearly interest for the account with account no: " + s[1].accountNumber + " is: " + s[1].calculateYearlyInterest());
        for(int i=0; i<2; i++) s[i].display();
        for(int i=0; i<3; i++) c[i].display();
    }
}