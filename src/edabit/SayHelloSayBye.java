package edabit;

public class SayHelloSayBye {

    public static String sayHelloBye(String name, int num) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        String output;
        switch(num) {
            case 0:
                output = "Bye " + name;
                break;
            case 1:
                output = "Hello " + name;
                break;
            default:
                output = "Invalid number";
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(sayHelloBye("Wiktor", 1));
    }
}
