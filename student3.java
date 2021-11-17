public class student3 {
    int adm_no;
    String name;
    String subject;

    student3(int a, String n, String s) {
        adm_no = a;
        name = n;
        subject = s;
    }

    void display() {
        System.out.println(adm_no + " " + name + " " + subject);
    }

    public static void main(String args[]) {
        student3 s1 = new student3(470, "lorraine", "mathematics");
        student3 s2 = new student3(418, "akale", "bs");
        student3 s3 = new student3(474, "hannington", "cre");

        student3 s4 = new student3(412, "mugendi", "agriculture");
        student3 s5 = new student3(398, "spencer", "kiswahili");

        student3 s6 = new student3(399, "abilena", "english");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();

    }
}