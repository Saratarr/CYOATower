package Pages;
import java.util.Random;

public class ProcRandNum implements Proc {
    @Override
    public void execute() {
        Random rand = new Random();

        int randNum1 = rand.nextInt(10);
        int randNum2 = rand.nextInt(100);
        int randNum3 = rand.nextInt(1000);

        System.out.println(randNum3);
    }
}
