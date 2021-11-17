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

    void withdrawal(float m) {
        if (amount < m) {
            System.out.println("you do not have sufficient funds to faccilitate the above requested transaction");
        } else {
            amount = amount - m;
            System.out.println(m + "has been widthrawn");
        }
    }

    void checkbalance() {
        System.out.println(" your balance is, " + amount);
    }

void display(){
System.out.println(acc_no+" "+name+" "+amount);

}

    
     public static void main(String[]args) {
        acc_no acc=new acc_no();
        acc.insert(1112225678,"lorraine",3000000);
        acc.display();
        acc.checkbalance();
        acc.deposit(1200000);
        acc.checkbalance();
        acc.withdrawal(500000);
        acc.checkbalance();
    }
}
