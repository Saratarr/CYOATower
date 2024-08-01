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

    static private int room = 0;
    static public List<Page> pages;

    static boolean suppressRoom = false;

    public static void main(String[] args) throws InterruptedException {

        // PagesPrompt pPrompt = new PagesPrompt();
        pages = new ArrayList<>();

        pages.add(PagesZero.page());  // LN 8 in PagesZero
        pages.add(PagesOne.page());  // "Factory Pattern"
        pages.add(PagesTwo.page());
        // pages.add(PagesThree.page());

        pages.add(new Page("Welcome to the Tower. ", 2, null));
        pages.add(new Page("Welcome to the Tower. ", 5, null));
        pages.add(new Page("Welcome to the Tower. ", 10, null));
        pages.add(new Page("Welcome to the Tower. ", 11, null));
        pages.add(new Page("Welcome to the Tower. ", 12, null));
        pages.add(new Page("Welcome to the Tower. ", 13, null));
        pages.add(new Page("Welcome to the Tower. ", 14, null));

        while (true) {
            Page p = Page.findPageNumber(pages, room);
            if (!suppressRoom) {
                p.executeProc();
                p.drawPage();
            }
            suppressRoom = false;
            int i = Choice.getChoice();
            if (i == -1) {
                p.drawPage();
                suppressRoom = true;
            } else if (p.choices.size() == 1) {
                room = p.choices.get(0).pageNumber;
            } else if (p.isPageValid(i) != null) {
                room = p.isPageValid(i).pageNumber;
            } else {
                System.out.println("Sorry, I didn't get that.");
                suppressRoom = true;
            }
        }
    }
}