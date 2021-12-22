package edabit.basiccalculator;

public class SwitchStatement {

    public static void main(String[] args) {

        int day = 4;
        String dayString;

        switch (day) {
            case 1:
                dayString = "Lunes";
                break;
            case 2:
                dayString = "Martes";
                break;
            case 3:
                dayString = "Miercoles";
                break;
            default:
                dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
