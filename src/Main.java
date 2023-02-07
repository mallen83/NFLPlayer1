import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Offensive offensive = new Offensive("Blue", "Johnson","UCLA","Quaterback","2/17/2021", 2, 4234, 760,22,35);
        Offensive offensive1 = new Offensive("August", "Clayton","FSU","Running back","7/22/1999", 6, 0, 1978,762,17);
        Defensive defensive = new Defensive("June","Allen","Cumberland","Free Safety","11/7/2000",3,4,86,2);
        Defensive defensive1 = new Defensive("Ken","Craig","Jackson St.","Linebacker","12/7/1988",11,2,111,5);

        //Random string generator in java
        Random random = new Random();
        
        //System.out.println(offensive.getFirstName() + " " + offensive.getLastName() + " " + offensive1.touchdowns);
        System.out.println(random.nextInt(offensive1.getRushingYards()) + " " + random.nextInt(defensive1.getTackles()));



    }
}