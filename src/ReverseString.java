import java.util.Scanner;

public class ReverseString {
    public static void Reverse(Scanner getArray) {
        String readLine = getArray.nextLine();

        for (int i = readLine.length() - 1; i >= 0; i--) {
            System.out.print(readLine.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Reverse(userInput);
        userInput.close();
    }
}
