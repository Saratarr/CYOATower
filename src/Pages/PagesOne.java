package Pages;

import java.util.ArrayList;
import java.util.List;

public class PagesOne {

    public static Page page() {
        String pText = "The heavy wooden door swings closed behind you with a " +
                "sudden bang, causing you to jump a little. A heavy click sound comes " +
                "from the door and you realize that it is now locked. You can not " +
                "return to the room you have left behind, and as you look around in " +
                "this new space, you recognize that this may be true going forward.\n";
        pText += "This room is just as bare as the room before, save for " +
                "a small window to your left and high and out of reach. There are " +
                "two doors in this room, both at the opposite end of the room--one " +
                "to the left and one to the right. Both doors are identical in appearance.\n";

        List<Choice> choices = new ArrayList<>();
        choices.add(new Choice("If you choose the door to the left, turn to Page 2.", 2));
        choices.add(new Choice("If you choose the door to the right, turn to Page 5.",  5));

        return new Page(pText, 1, choices);
    }
}
