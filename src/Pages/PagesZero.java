package Pages;

import java.util.ArrayList;
import java.util.List;

public class PagesZero {

    public static Page page() {

        System.out.println("====================================");
        String pText = "You awake with a start. Where are you? How did you " +
                "get here? You don't remember anything before this moment, yet " +
                "somehow you find yourself waking from a mysterious slumber within " +
                "a bare and circular room. There are no windows or defining " +
                "features in this room, save for the straw mat you were lying on just " +
                "moments ago. \n\nA heavy wooden door beckons you from across the room. " +
                "Passing through this door appears to be the only way out of this room. \n\n";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("When you are ready to pass through the door, press '1'.", 1));

        return new Page(pText, 11, choices);
    }
}
