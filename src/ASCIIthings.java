import java.util.ArrayList;
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







    static void writeDigits(ArrayList<String[][]> digits) {
        for (int row = 0; row < digits.get(0).length; row++) {
            for (String[][] digit : digits) {
                System.out.print(digit[row][0] + " ");
            }
            System.out.println();
        }
    }


    static ArrayList<String[][]> arrayList = new ArrayList<>();
    static void printDigit(String[][] tempDoubleArr){
        arrayList.add(tempDoubleArr);
    }


    public static void printer(int intOne, int temp ,int intTwo){
        if (intOne > 9){
            canoodle(intOne);
        }
        else{
            printDigit(threeDArray[intOne]);
        }
        System.out.println(spacer);
        if (temp == 0){
            temp = 11;
        }
        else{
            temp = 10;
        }
        printDigit(threeDArray[temp]);
        System.out.println(spacer);
        if (intTwo > 9){
            canoodle(intTwo);
        }
        else{
            printDigit(threeDArray[intTwo]);
        }
        System.out.println(spacer);
        printDigit(threeDArray[12]);
        System.out.println(spacer);
        printDigit(threeDArray[13]);
        writeDigits(arrayList);
        arrayList = new ArrayList<>();

    }
    public static void printer(int intOne, int temp ,int intTwo, int intAnswer){
        if (intOne > 9){
            canoodle(intOne);
        }
        else{
            printDigit(threeDArray[intOne]);
        }
        System.out.println(spacer);
        if (temp == 0){
            temp = 11;
        }
        else{
            temp = 10;
        }
        printDigit(threeDArray[temp]);
        System.out.println(spacer);
        if (intTwo > 9){
            canoodle(intTwo);
        }
        else{
            printDigit(threeDArray[intTwo]);
        }
        System.out.println(spacer);
        printDigit(threeDArray[13]);
        System.out.println(spacer);
        printDigit(threeDArray[12]);
        System.out.println(spacer);
        canoodle(intAnswer);
        writeDigits(arrayList);
        arrayList = new ArrayList<>();
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




}






