package Pages;

import java.util.ArrayList;
import java.util.List;

public class PagesTwo {

    public static Page page() throws InterruptedException {



        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("If you choose to go back the way you came, return to Page 1", 1));
        choices.add(new Choice("If you choose to continue moving forward, turn to Page 5.",  5));

        return new Page("", 2, choices, new ProcTextWait());


    }

}
