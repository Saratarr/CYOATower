package Pages;
import java.util.ArrayList;
import java.util.List;

public class Page {

    public String text;
    public int pageNumber;
    public List<Choice> choices;  // Needs a constructor

    public Page(String text, int pageNumber, List<Choice> choices) {  // Constructor
        this.text = text;
        this.pageNumber = pageNumber;
        this.choices = choices;  // Setting class level variables in constructor
        if (choices != null) {
            this.choices = choices;
        } else {
            this.choices = new ArrayList<>();
            this.choices.add(new Choice("Turn to the next page.", pageNumber + 1));
            this.choices.add(new Choice("Turn to the next page.", pageNumber + 2));
        }
    }

    public Page() {
    }

    static public Page findPageNumber(List<Page> chkP, int room) {  // Method, finds a page by its page number
        for (Page p: chkP) {
            if (p.pageNumber == room) {
                return p;
            }
        }
        return null;
    }

    public Choice isPageValid(int p) {
        for (Choice c: this.choices) {
            if (c.pageNumber == p) {
                return c;
            }
        }
        return null;
    }

    public void drawPage() {  // Method, prints out page choices
        System.out.print(text);
        for (Choice c: choices) {
            c.drawChoice();
        }
    }
}
