import java.util.Random;
import java.util.Scanner;
public class Game {
    int counter = 0;

    Scanner scan = new Scanner(System.in);


    Random rand = new Random();
    int[][] levelZero = {{1, 2, 3, 4}, {1, 2, 0, 1}};


    int[][] levelOne = {{1, 2, 3},
            {1, 2, 3}};


    int[][] levelTwo = {{10, 20, 30},
            {5, 3, 7}};


    int[][] levelThree = {{15, 17, 32, 7},
            {61, 67, 53, 19}};
    int[][] levelFour = {{15, 33, 41},
            {17, 56, 81}};
    public void startGame(){
        int counter = 0;
        playThrough();
    }


    public boolean generateEquation(int[][] level){
        int intOne = level[0][rand.nextInt(level[0].length)];
        int intTwo = level[1][rand.nextInt(level[1].length)];
        int intAnswer;
        int temp = rand.nextInt(2);
        if (temp == 0){
            intAnswer = intOne * intTwo;
        }
        else{
            intAnswer = intOne + intTwo;
        }
        ASCIIthings.printer(intOne, temp ,intTwo);
        int userAnswer = scan.nextInt();
        if (userAnswer == intAnswer){
            System.out.println("Correct!");
            ASCIIthings.printer(intOne, temp ,intTwo, intAnswer);
            return true;
        }
        else{
            System.out.println("Incorrect");
            ASCIIthings.printer(intOne, temp ,intTwo, intAnswer);
            return false;
        }


    }
    public int playThrough(){

        while (counter != 5){
            if (counter == 0){
                System.out.println("Level Zero");
                System.out.println("the question: ");
                if(generateEquation(levelZero)){
                    counter ++;
                }
                else{
                    return counter;
                }


            }
            else if (counter == 1){
                System.out.println("Level One");
                System.out.println("the question: ");
                if(generateEquation(levelOne)){
                    counter ++;
                }
                else{
                    return counter;
                }
            }
            else if (counter == 2){
                System.out.println("Level Two");
                System.out.println("the question: ");
                if(generateEquation(levelTwo)){
                    counter ++;
                }
                else{
                    return counter;
                }
            }

            else if (counter == 3){
                System.out.println("Level Three");
                System.out.println("the question: ");
                if(generateEquation(levelThree)){
                    counter ++;
                }
                else{
                    return counter;
                }
            }
            else if (counter == 4) {
                System.out.println("Level Four");
                System.out.println("the question: ");
                if (generateEquation(levelFour)) {
                    counter++;
                } else {
                    return counter;
                }
            }
        }
        return 0;
    }






}
