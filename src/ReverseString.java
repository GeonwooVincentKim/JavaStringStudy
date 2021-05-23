public class ReverseString {
    public static void main(String[] args) {
        String readLine = "YOU ARE A GOOD MAN";
        char[] convertToArray = readLine.toCharArray();
        char[] reverseArray = new char[convertToArray.length];

        for (int i = 0; i < convertToArray.length; i++) {
            reverseArray[convertToArray.length - 1 - i] = convertToArray[i];
        }

        String getReversedArr = new String(reverseArray);
        System.out.println(getReversedArr);
    }
}
