class employees {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;

    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class testemployees1 {
    public static void main(String[] args) {
        employees em1 = new employees();
        employees em2 = new employees();
        employees em3 = new employees();
        employees em4 = new employees();
        employees em5 = new employees();
        em1.insert(361, "kelvin", 2500);
        em2.insert(261, "john", 3600);
        em3.insert(372, "mm", 4700);
        em4.insert(410, "vivian", 1200);
        em5.insert(400, "stanely", 4000);
        em1.display();
        em2.display();
        em3.display();
        em4.display();
        em5.display();

    }
}
