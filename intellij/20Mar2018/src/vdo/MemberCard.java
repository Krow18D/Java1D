package vdo;

/**
 * Created by prasert on 11/9/2014.
 */
public abstract class MemberCard {
    private String id, firstName, lastName;

    public float discount(float amount) {
        return amount * .02f;
    }

    public abstract boolean accessLounge();

    public MemberCard(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MemberCard() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
