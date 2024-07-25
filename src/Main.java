import Pages.Choice;
import Pages.Page;
import Pages.PagesOne;
import Pages.PagesZero;
import Pages.PagesTwo;
import Pages.PagesThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static private int room = 11;
    static public List<Page> pages;

    public static void main(String[] args) throws InterruptedException {

        // PagesPrompt pPrompt = new PagesPrompt();
        pages = new ArrayList<>();

        pages.add(PagesZero.page());
        pages.add(PagesOne.page());  // "Factory Pattern"
        pages.add(PagesTwo.page());
        pages.add(PagesThree.page());

        pages.add(new Page("Welcome to the Tower. ", 2, null));
        pages.add(new Page("Welcome to the Tower. ", 5, null));
        pages.add(new Page("Welcome to the Tower. ", 10, null));
        pages.add(new Page("Welcome to the Tower. ", 11, null));
        pages.add(new Page("Welcome to the Tower. ", 12, null));
        pages.add(new Page("Welcome to the Tower. ", 13, null));
        pages.add(new Page("Welcome to the Tower. ", 14, null));

        while (true) {
            Page p = Page.findPageNumber(pages, room);
            p.drawPage();
            int i = Choice.getChoice();
            if (p.isPageValid(i) != null) {
                room = p.isPageValid(i).pageNumber;
            }
        }
    }
}