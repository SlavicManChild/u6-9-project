import java.util.Scanner;
public class Player {

    int regGamesWon;
    int extraGamesWon;

    int points;
    boolean extraGameAchieved;

    Player(){
        homeMenu();
    }

    Scanner scan = new Scanner(System.in);

    public void homeMenu(){
        if (extraGameAchieved){
            System.out.println("Congrats on achieving EXTRA GAME MODE");
            System.out.println("You currently have " + extraGamesWon + " games won \n");
        }
        System.out.println("You currently have " + regGamesWon + " games won");
        System.out.println("Would you like to play another game?");
        if (!scan.nextLine().equals("hellseeker")){
            Game newGame = new Game();
            newGame.startGame();
        }

    }
}
