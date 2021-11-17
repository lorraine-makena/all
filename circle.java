class are {
    int radious;

    void insert(int r) {
        radious = r;
    }

    void calculatearea() {
        System.out.println(22 / 7 * radious * radious);
    }
}

public class circle {
    public static void main(String[] args) {
        are r1 = new are();
        are r2 = new are();

        r1.insert(21);

        r2.insert(7);
        r1.calculatearea();
        r2.calculatearea();

    }
}
