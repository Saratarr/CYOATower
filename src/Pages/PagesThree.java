package Pages;

import static java.lang.Thread.sleep;

public class PagesThree {

    public static Page page() throws InterruptedException {
        System.out.println("You realize");
        Thread.sleep(2000);

        System.out.println("that you're boned");
        return null;
    }
}
