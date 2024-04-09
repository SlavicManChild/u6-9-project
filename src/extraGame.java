public class extraGame extends Game {

    private final int[][] levelOneHundred = {{123, 456, 789, 101}, {621, 131, 141, 151}, {832, 222, 111, 211}, {923, 423, 212, 876}};


    @Override
    public int playThrough(){

        if(generateEquation(levelOneHundred)){
            return 1;
        }
        return 0;
    }

}
