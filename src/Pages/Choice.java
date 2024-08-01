package Pages;

import java.util.Scanner;

public class Choice {

    public String text;
    public int pageNumber;

    static Scanner s = new Scanner(System.in);

    public Choice(String text, int pageNumber) {
        this.text = text;
        this.pageNumber = pageNumber;
    }

    static public int getChoice() {
        System.out.println("-->");
        String playerInput = s.nextLine();
        if (playerInput.equals("?")) {
            return -1;
        }
        try {
            return Integer.parseInt(playerInput);  // Wrapper class
        } catch (Exception e) {
            return 0;
        }

    }

    public void drawChoice() {
        System.out.println(text);
        System.out.println("You Turn to Page " + pageNumber);
    }
}
