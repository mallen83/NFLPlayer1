public class Offensive extends Player {

    //make these privates
    private int passingYards;
    private int rushingYards;
    private int receivingYards;
    private int touchdowns;

    public Offensive(String firstName, String lastName, String college, String position, String birthdate, int experience, int passingYards, int rushingYards, int receivingYards, int touchdowns) {
        super(firstName, lastName, college, position, birthdate, experience);
        this.passingYards = passingYards;
        this.rushingYards = rushingYards;
        this.receivingYards = receivingYards;
        this.touchdowns = touchdowns;
    }

    public int getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }

    public int getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(int rushingYards) {
        this.rushingYards = rushingYards;
    }

    public int getReceivingYards() {
        return receivingYards;
    }

    public void setReceivingYards(int receivingYards) {
        this.receivingYards = receivingYards;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }
}
