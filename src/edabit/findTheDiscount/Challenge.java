package edabit.findTheDiscount;

public class Challenge {

    public static float findTheDiscount(float price, float discount) {
        float discountAmount = (price * discount) / 100;
        return price - discountAmount;
    }
}
