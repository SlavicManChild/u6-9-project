
public class ASCIIthings {

    String[][][] 3darray = {zero, one, two, three, four, five, six, seven, eight, nine, addition, multiplication, equals, question};
    
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

    static String spacer = "                 ";



    public static void printDigit(String[][] digit) {
        for (String[] row : digit) {
            for (String symbol : row) {
                System.out.println(symbol);
            }
        }
        System.out.println();
    }

    public static void printer(int intOne, int temp ,int intTwo){
        printDigit();
    }
    public static void printer(int intOne, int temp ,int intTwo, int intAnswer){

    }
}



