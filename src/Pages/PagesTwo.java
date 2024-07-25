package Pages;

import java.util.ArrayList;
import java.util.List;

public class PagesTwo {

    public static Page page() throws InterruptedException {
        String pText = "There's something odd";
        Thread.sleep(2000);

        System.out.println("about this room");
        Thread.sleep(2000);

        System.out.println("and you can't quite");
        Thread.sleep(2000);

        System.out.println("figure out what");
        Thread.sleep(2000);

        System.out.println("but you know that");
        Thread.sleep(2000);

        System.out.println("you need to");
        Thread.sleep(2000);

        System.out.println("get out of here");
        Thread.sleep(2000);

        System.out.println("FAST!");
        Thread.sleep(2000);

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("If you choose to go back the way you came, return to Page 1", 1));
        choices.add(new Choice("If you choose to continue moving forward, turn to Page 5.",  5));

        return new Page(pText, 2, choices);


    }

}
