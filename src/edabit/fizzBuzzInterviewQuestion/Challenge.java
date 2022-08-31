package edabit.fizzBuzzInterviewQuestion;

public class Challenge {

    public static void main(String[] args) {
//        System.out.println(fizzBuzz(3));
//        System.out.println(fizzBuzz(5));
//        System.out.println(fizzBuzz(15));
//        System.out.println(fizzBuzz(4));

        // FizzBuzz: One Simple Interview Question
        // https://www.youtube.com/watch?v=QPZ0pIK_wsc
        for (int i = 1; i <= 100; i ++) {
            System.out.println(fizzBuzz(i));
        }
    }

    // moje rozwiązanie
//    public static String fizzBuzz(int number) {
//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        } else if (number % 3 == 0) {
//            return "Fizz";
//        } else if (number % 5 == 0) {
//            return "Buzz";
//        } else {
//            return Integer.toString(number);
//        }
//    }

    // rozwiązanie z filmiku wyżej (założeniem DRY)
    public static String fizzBuzz(int number) {
        String output = "";
        if (number % 3 == 0) {
            output += "Fizz";
        }
        if (number % 5 == 0) {
            output += "Buzz";
        }
        if (output == "") {
            output = Integer.toString(number);
        }
        return output;
    }
}
