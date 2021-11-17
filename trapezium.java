class area {
    int length;
    int sideb;
    int height;

    void insert(int a, int b, int h) {
        length = a;
        sideb = b;
        height = h;
    }

    void calculatearea() {
        System.out.println((length + sideb) * height * 1 / 2);

    }
}

public class trapezium {
    public static void main(String[] args) {
        area r1 = new area();
        area r2 = new area();
        r1.insert(50, 40, 10);
        r2.insert(100, 2, 20);
        r1.calculatearea();
        r2.calculatearea();

    }
}