import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Player player1 = new Player() {};
        Player player = new Player("Matt","Jones","Arizona St.","Safety","10/2/1999", 7) {};
        Offensive offensive = new Offensive("Blue", "Johnson","UCLA","Quaterback","2/17/2021", 2, 4234, 760,22,35);
        Offensive offensive1 = new Offensive("August", "Clayton","Florida St.","Running back","7/22/1999", 6, 77, 1978,762,17);
        Offensive offensive2 = new Offensive("Jalen", "Hurts", "Alcorn St.","Quaterback","9/17/1995",6,4878,854,0,44);
        Defensive defensive = new Defensive("June","Allen","Cumberland","Free Safety","11/7/2000",3,4,86,2);
        Defensive defensive1 = new Defensive("Ken","Craig","Jackson St.","Linebacker","12/7/1988",11,2,111,5);
        Defensive defensive2 = new Defensive("Chris", "Jones", "Mississippi St.", "Defensive Tackle", "11/7/1994", 7,2,77,13);

        //Random string generator in java
        Random random = new Random();

        //System.out.println(player + " " + "experience in the NFL.");
        //System.out.println(offensive);
        //System.out.println(offensive1);
        //System.out.println(defensive);
        //System.out.println(defensive1);
        System.out.println(offensive2.getFirstName() + " " + offensive2.getLastName() + " " + offensive2.getCollege() + " " + offensive2.getPosition() + " " + offensive2.getBirthdate() + " " + offensive2.getExperience() + " " + offensive2);
        System.out.println(defensive2.getFirstName() + " " + defensive2.getLastName() + " " + defensive2.getCollege() + " " + defensive2.getPosition() + " " + defensive2.getBirthdate() + " " + defensive2.getExperience() + " " + defensive2);
        //System.out.println(random.nextInt(offensive1.getRushingYards()) + " " + random.nextInt(defensive1.getTackles()));


    }
}