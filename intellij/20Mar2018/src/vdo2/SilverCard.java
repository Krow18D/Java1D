package vdo2;

/**
 * Created by prasert on 11/9/2014.
 */
public class SilverCard implements IMemberCard {
    @Override
    public float discount(float amount) {
        return amount * .02f;
    }

    @Override
    public boolean accessLounge() {
        return false;
    }
}
