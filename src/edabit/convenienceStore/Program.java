package edabit.convenienceStore;

public class Program {

    int myIntValue = 5;
    float myFloatValue = 5.25f;
    double myDoubleValue = 5.25d;

    public static void main(String[] args) {
        System.out.println(changeEnough(new int[] {2, 100, 0, 0}, 14.11 ));
    }

    /**
     * moje pierwotne rozwiązanie
     */
//    public static boolean changeEnough (int[] amountOfChange, double totalDue) {
//        if (amountOfChange.length != 4) {
//            System.out.println("Invalid input");
//            return false;
//        }
//        double sumOfChange = 0.0;
//        for (int i = 0; i < amountOfChange.length; i ++) {
//            switch(i) {
//                case 0:
//                    sumOfChange += amountOfChange[i] * 0.25;
//                    break;
//                case 1:
//                    sumOfChange += amountOfChange[i] * 0.10;
//                    break;
//                case 2:
//                    sumOfChange += amountOfChange[i] * 0.05;
//                    break;
//                case 3:
//                    sumOfChange += amountOfChange[i] * 0.01;
//                    break;
//                default:
//                    throw new IllegalStateException("No such option in switch statement");
//            }
//        }
//        return sumOfChange >= totalDue;
//    }

    /**
     * prostsze, lepsze rozwiązanie
     */
    public static boolean changeEnough (int[] amountOfChange, double totalDue) {
        if (amountOfChange.length != 4) {
            System.out.println("Invalid input");
            return false;
        }
        double sumOfChange = amountOfChange[0] * 0.25
                + amountOfChange[1] * 0.10
                + amountOfChange[2] * 0.05
                + amountOfChange[3] * 0.01;
        return sumOfChange >= totalDue;
    }
}
