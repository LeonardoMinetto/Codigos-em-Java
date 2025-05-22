import java.util.Random;

public class Die{
    private int sideUp;
    public Die(){
        sideUp = 2;
    }
    public int getSideUp(){
        return sideUp;
    }
    public void roll(){
        Random r = new Random();
        sideUp= r.nextInt(6)+1;
    }
    public void die() {
        System.out.println("die")
    }
}