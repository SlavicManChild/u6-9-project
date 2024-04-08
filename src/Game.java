import java.util.Random;
public class Game {
    int counter = 0;


    Random rand = new Random();
    int[] levelZero = {1, 2, 3, 4};


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


    public int generateEquation(int[][] level){
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

        ASCIIthings.printer(intOne, temp ,intTwo, intAnswer);


    }
    public int playThrough(){
        while (counter != 5){
            if (counter == 0){
                System.out.println("Level Zero");
                System.out.println("the question: ");


            }
            else if (counter == 1){
                System.out.println("Level One");
                ASCIIthings.printDigit(ASCIIthings.);
            }
            else if (counter == 2){
                System.out.println("Level Two");
            }
            else if (counter == 3){
                System.out.println("Level Three");
            }
            else if (counter == 4){
                System.out.println("Level Four");
            }
        }
    }






}
