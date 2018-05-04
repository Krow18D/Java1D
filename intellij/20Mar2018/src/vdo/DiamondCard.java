package vdo;

/**
 * Created by prasert on 11/9/2014.
 */
public class DiamondCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return amount * .20f;
    }

    @Override
    public boolean accessLounge() {
        return true;
    }
}
