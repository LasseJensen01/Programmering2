package Ex01;

public class FullName implements Comparable<FullName>{
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "" + firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(FullName o) {
        int compared = this.getLastName().compareTo(o.getLastName());
        if (compared == 0) compared = this.getFirstName().compareTo(o.getFirstName());
        return compared;
    }
}
