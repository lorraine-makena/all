class acc_no {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float m) {
        acc_no = a;
        name = n;
        amount = m;
    }

    void deposit(float m) {
        amount = amount + m;
        System.out.println("the deposited amount is:" + m);
    }

    void widthrawal(float m) {
        if (amount < m) {
            System.out.println("you do not have sufficient funds to faccilitate the above requested transaction");
        } else {
            amount = amount - m;
            System.out.println(m + "has been widthrawn");
        }
    }

    void chechbalance() {
        System.out.println(" your balance is, " + amount);
    }
void display()
System.out.println(acc_no+" "+name+" "+amount);
}
class testamount
{
     public static void main(String[]args) {
        account acc=new account();
        acc.insert();
    }
}
