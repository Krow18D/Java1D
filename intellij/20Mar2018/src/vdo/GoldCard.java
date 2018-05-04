package vdo;

/**
 * Created by prasert on 11/9/2014.
 */
public class GoldCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return amount * .05f;
    }

    @Override
    public boolean accessLounge() {
        return false;
    }
}
