
public class ASCIIthings {

    
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
    static String[][][] threeDArray = {zero, one, two, three, four, five, six, seven, eight, nine, addition, multiplication, equals, question};


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
        printDigit(threeDArray[intAnswer]);
    }

    public static void canoodle(int theInteger) {
        int[] digits = new int[String.valueOf(theInteger).length()];
        int index = digits.length - 1;

        while (theInteger > 0) {
            digits[index--] = theInteger % 10;
            theInteger /= 10;
        }

        for (int i : digits){
            printDigit(threeDArray[i]);
        }
    }

    public static void main(String[] args){
        canoodle(123);
    }
}



