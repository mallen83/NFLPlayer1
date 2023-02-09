public class Defensive extends Player{

    private int interceptions;
    private int tackles;
    private int sacks;

    public Defensive(String firstName, String lastName, String college, String position, String birthdate, int experience, int interceptions, int tackles, int sacks) {
        super(firstName, lastName, college, position, birthdate, experience);
        this.interceptions = interceptions;
        this.tackles = tackles;
        this.sacks = sacks;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }
}
