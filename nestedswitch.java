public class nestedswitch {
    public static void main(String[] arg) {
        char branch = 'e';
        int college_year = 3;
        switch (college_year) {
        case 1:
            System.out.println("english,maths,science");
            break;
        case 2:
            switch (branch) {
            case 'c':
                System.out.println("operating system java,data structure");
                break;
            case 'e':
                System.out.println("micro_procesor logic switching theory");
                break;
            case 'm':
                System.out.println("Drawing,manufacturing machines");
                break;
            }
            break;
        case 3:
            switch (branch) {
            case 'c':
                System.out.println("computer organization,multimedia");
                break;
            case 'e':
                System.out.println("fundamentals of logic design, micro electronics");
                break;
            case 'm':
                System.out.println("internal combustion engine, mechanical vibration");
                break;
            }
            break;
        case 4:
            switch (branch) {
            case 'c':
                System.out.println("data communications & networks,multimedia");
                break;
            case 'e':
                System.out.println("embeded system, image processing");
                break;
            case 'm':
                System.out.println("production technology, thermal engineering");
                break;
            }
            break;
        }
    }
}