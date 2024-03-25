
public class ASCIIthings {
    static String[][][] threeDArray = {{{"zero"}, {"one"}, {"two"}}, {{"three"}, {"four"},
            {"five"}}, {{"six"}, {"seven"}, {"eight"}}, {{"nine"}, {"addition"},
            {"multiplication"}}, {{"equals"}, {"question"}}};
    
    static String[][] zero = {
            {"  #####  "},
            {" #     # "},
            {"#       #"},
            {"#       #"},
            {"#       #"},
            {" #     # "},
            {"  #####  "}
    };


    static String[][] one = {
            {"    #    "},
            {"   ##    "},
            {"    #    "},
            {"    #    "},
            {"    #    "},
            {"    #    "},
            {"  #####  "}
    };


    static String[][] two = {
            {"  #####  "},
            {" #     # "},
            {"       # "},
            {"  #####  "},
            {" #       "},
            {"#        "},
            {" ####### "}
    };


    static String[][] three = {
            {"  #####  "},
            {" #     # "},
            {"       # "},
            {"  #####  "},
            {"       # "},
            {" #     # "},
            {"  #####  "}
    };


    static String[][] four = {
            {"#       #"},
            {"#       #"},
            {"#       #"},
            {"#########"},
            {"        #"},
            {"        #"},
            {"        #"}
    };


    static String[][] five = {
            {" ####### "},
            {"#        "},
            {"#        "},
            {" ######  "},
            {"       # "},
            {" #     # "},
            {"  #####  "}
    };


    static  String[][] six = {
            {"  #####  "},
            {" #     # "},
            {"#        "},
            {"#######  "},
            {"#      # "},
            {" #    #  "},
            {"  ####   "}
    };


    static String[][] seven = {
            {" ####### "},
            {"#     #  "},
            {"     #   "},
            {"    #    "},
            {"   #     "},
            {"  #      "},
            {"  #      "}
    };


    static String[][] eight = {
            {"  #####  "},
            {" #     # "},
            {"#       #"},
            {" ####### "},
            {"#       #"},
            {" #     # "},
            {"  #####  "}
    };


    static  String[][] nine = {
            {"  #####  "},
            {" #     # "},
            {"#       #"},
            {" ####### "},
            {"       # "},
            {" #     # "},
            {"  #####  "}
    };


    static  String[][] addition = {
            {"   ###   "},
            {"   ###   "},
            {"   ###   "},
            {"#########"},
            {"#########"},
            {"   ###   "},
            {"   ###   "},
            {"   ###   "},
    };


    static String[][] multiplication = {
            {"#       #"},
            {" #     # "},
            {"  #   #  "},
            {"   ###   "},
            {"  #   #  "},
            {" #     # "},
            {"#       #"}
    };
    static String[][] equals = {
            {"         "},
            {"         "},
            {"#########"},
            {"         "},
            {"#########"},
            {"         "},
            {"         "}
    };


    static String[][] question = {
            {"   ##    "},
            {"  #   #  "},
            {"      #  "},
            {"    #    "},
            {"    #    "},
            {"         "},
            {"    #    "}
    };

    static String spacer = "     ";



    public static void printDigit(String[][] digit) {
        for (String[] row : digit) {
            for (String symbol : row) {
                System.out.println(symbol);
            }
        }
        System.out.println();
    }

    public static void printer(int intOne, int temp ,int intTwo){
        printDigit(threeDArray[intOne]);
        System.out.println(spacer);
        printDigit(threeDArray[temp]);
        System.out.println(spacer);
        printDigit(threeDArray[intTwo]);
        System.out.println(spacer);
        printDigit(threeDArray[13]);
        System.out.println(spacer);
        printDigit(threeDArray[14]);

    }
    public static void printer(int intOne, int temp ,int intTwo, int intAnswer){
        printDigit(threeDArray[intOne]);
        System.out.println(spacer);
        printDigit(threeDArray[temp]);
        System.out.println(spacer);
        printDigit(threeDArray[intTwo]);
        System.out.println(spacer);
        printDigit(threeDArray[13]);
        System.out.println(spacer);
        printDigit(threeDArray[int]);
    }

    public static void canoodle(int intAnswer){
        // make int aswer as strig, take it apart into ints printDigits( em, and be jap usaodfhnasdadajk
    }
}



