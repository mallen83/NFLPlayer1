public abstract class Player {

 //update my player class
    private String firstName;
    private String lastName;
    private String college;
    private String position;
    private String birthdate;
    private int experience;

    public Player(String firstName, String lastName, String college, String position, String birthdate, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.college = college;
        this.position = position;
        this.birthdate = birthdate;
        this.experience = experience;
    }

    public Player() {
        System.out.println("Patrick Mahomes is the best quaterback in the league. He attended Texas Tech and has 7 years of experience in the NFL.");
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", college='" + college + '\'' +
                ", position='" + position + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", experience=" + experience +
                '}';
    }
}
