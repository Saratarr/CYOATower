package Pages;

public class ProcTextWait implements Proc {
    @Override
    public void execute() {
        try {
            System.out.println("There's something odd");
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
        } catch (Exception e) {

        }
    }
}
