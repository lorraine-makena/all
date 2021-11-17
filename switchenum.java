public class switchenum {
    public enum days {
        sun, mon, tue, wed, thur, fri, sat
    }

    public static void main(String[] arg) {
        days[] makena = days.values();
        for (days day : makena)

        {
            switch (day) {
            case sun:
                System.out.println("today is sunday");
                break;
            case mon:
                System.out.println("today is monday");
                break;

            case tue:
                System.out.println("today is tuesday");
                break;

            case wed:
                System.out.println("today is wednesday");
                break;

            case thur:
                System.out.println("today is thursday");
                break;

            case fri:
                System.out.println("today is friday");
                break;

            case sat:
                System.out.println("today is saturday");
                break;
            }
        }

    }
}