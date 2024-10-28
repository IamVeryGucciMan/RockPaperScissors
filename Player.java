import java.util.Scanner;

public class Player {
    private int choice;

    public void setPcChoice(){
        System.out.print("Select: ");
        Scanner askChoice = new Scanner(System.in);
        String pcChoice = askChoice.nextLine();
        //TODO
        //Convert plyrChoice to an int this.choice where
        //0 if "Rock"
        //1 if "Paper"
        //2 if "Scissors"
        //2 Ask again if anything else
        //converting input to all UPPERCASE will make it easier

        if (pcChoice.equalsIgnoreCase("ROCK")){
            choice = 0;
        } else if (pcChoice.equalsIgnoreCase("PAPER")){
            choice = 1;
        } else if (pcChoice.equalsIgnoreCase("SCISSORS")){
            choice = 2;
        } else {
            choice = 3;

        }
    }

    public void setNpcChoice(){
        choice = (int)(Math.random() * 3);
    }

    public int getChoice(){
        return choice;
    }
}
