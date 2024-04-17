import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        variables
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenarator = new Random();
        String[] passwordSymbols = {"!", "@", "#", "$", "%", "^", "&", "*"};
        int[] passwordNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] passwordCharacters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] passwordUpperCases = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String symbolTest, passwordSymbol = "", passwordNumber = "", passwordChar = "", passwordUpperCase = "", finalPassword = "";
        int numOfChar, randomSymbol, randomNum, randomChar, randomUpper;
        System.out.println("<!-----------------------------------------!>");
        System.out.println("\t\tWELCOME TO PASSWORD GENERATOR");
        System.out.println("<!-----------------------------------------!>");
        System.out.print("\nDo you want to generate a password (Y/N) : ");
        symbolTest = inputScanner.nextLine();
        if (symbolTest.equalsIgnoreCase("y") || symbolTest.equalsIgnoreCase("n")) {
            if (symbolTest.equalsIgnoreCase("y")) {
                for (int x = 1; x <= 2; x++) {
                    for (int i = 1; i <= 2; i++) {
                        randomSymbol = randomGenarator.nextInt(passwordSymbols.length);
                        passwordSymbol += passwordSymbols[randomSymbol];
                        randomNum = randomGenarator.nextInt(passwordNumbers.length);
                        passwordNumber += passwordNumbers[randomNum];
                        randomChar = randomGenarator.nextInt(passwordCharacters.length);
                        passwordChar += passwordCharacters[randomChar];
                        randomUpper = randomGenarator.nextInt(passwordUpperCases.length);
                        passwordUpperCase += passwordUpperCases[randomUpper];
                    }
                }
                finalPassword = passwordUpperCase + passwordSymbol + passwordNumber + passwordChar;
            } else if (symbolTest.equalsIgnoreCase("n")) {
                System.out.print("Good bye!");
            }
            System.out.println(finalPassword);
        } else {
            System.out.println("Invalid input! Try again with Y or N");
        }
    }
}
