package vdo;

/**
 * Created by prasert on 11/9/2014.
 */
public class MemberCardV2 {
    private String id, firstName, lastName;
    private String level; // [S]ilver; [G]old; [P]latinum;

    public float discount(float amount) {
        float discountRate = 0f;
        if (level.equalsIgnoreCase("S")) {
            discountRate = 0.02f;
        } else if (level.equalsIgnoreCase("G")) {
            discountRate = 0.05f;
        } else if (level.equalsIgnoreCase("P")) {
            discountRate = 0.10f;
        } else if (level.equalsIgnoreCase("D")) {
            discountRate = 0.20f;
        } else {
            discountRate = 0f;
        }
        return amount * discountRate;
    }

    public boolean accessLounge() {
        boolean access;
        if (level.equalsIgnoreCase("S")) {
            access = false;
        } else if (level.equalsIgnoreCase("G")) {
            access = false;
        } else if (level.equalsIgnoreCase("P") || level.equalsIgnoreCase("D")) {
            access = true;
        } else {
            access = false;
        }
        return access;
    }

    public MemberCardV2(String id, String firstName, String lastName, String level) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
    }

    public MemberCardV2() {
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
