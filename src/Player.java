import java.util.Scanner;
public class Player {

    int regGamesWon;
    int extraGamesWon;

    int points;

    int extraPoints;
    boolean extraGameAchieved;

    Player(){
        homeMenu();
    }

    Scanner scan = new Scanner(System.in);

    public void homeMenu(){
        if (regGamesWon > 2){
            extraGameAchieved = true;
        }
        if (extraGamesWon > 3){
            System.out.println("You won fr this time");
            System.exit(0);
        }
        if (extraGameAchieved){
            System.out.println("Congrats on achieving EXTRA GAME MODE");
            System.out.println("You currently have " + extraGamesWon + " games won \n");
        }
        System.out.println("You currently have " + regGamesWon + " games won");
        System.out.println("Would you like to play another game?");
        if (extraGameAchieved){
            System.out.println("too play the extra game mode enter 'extra' ");
        }
        String question = scan.nextLine();
        if (!question.equals("hellseeker")) {
            Game newGame = new Game();
            int temp = newGame.startGame();
            if (temp == 5){regGamesWon++;}
            points += temp;
        }
        if (question.equals("hellseeker") || !scan.nextLine().equals("extra") && extraGameAchieved) {
            extraGame extraGame = new extraGame();
            int temp = extraGame.startGame();
            if (temp == 1){regGamesWon++;}
            extraPoints += temp;
        }
        homeMenu();


    }
}
