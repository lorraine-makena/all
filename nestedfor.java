public class nestedfor {
    public static void main(String[] args) {
        for (int m = 1; m <= 10; m++) {
            for (int k = 2; k <= 12; k++)

            {
                System.out.println(m * k);
                // System.out.println("break");
            }
        }
    }
}