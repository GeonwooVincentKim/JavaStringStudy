import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class CircuitSentences {
    public static Scanner readFile() {
        Scanner fileReader = null;
        File file = new File("data.txt");

        try {
            fileReader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileReader;
    }

    public static void writeFile(String getResult) {
        try {
            FileWriter fileWriter = new FileWriter("result1.txt");
            fileWriter.write(getResult);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getData(Scanner getFile) {
        int readLine = Integer.parseInt(getFile.nextLine());

        String getData = "";
        String toLowerString = "";
        String[] getDataArray = null;
        String result = "";
        boolean isIterate = false;

        for (int i = 1; i <= readLine; i++) {
            getData = getFile.nextLine();
            toLowerString = getData.toLowerCase();
            getDataArray = toLowerString.split("");

            for (int j = 0; j < getDataArray.length / 2; j++) {
                if (getDataArray[j].equals(getDataArray[getDataArray.length - j - 1])
                ) {
                    isIterate = true;
                } else {
                    isIterate = false;
                    break;
                }
            }
            result += getData + "\n" + isIterate + "\n";
            result += "\n";
        }

        out.println(result);
        return result;
    }

    public static void getResult(Scanner readResult) {
        String getResult = getData(readResult);
        writeFile(getResult);
    }

    public static void main(String[] args) {
        Scanner userSelect = new Scanner(System.in);
        out.println("선택하세요\n1. 파일 입출력\n2. 직접 입력");

        int selectNum = userSelect.nextInt();
        Scanner getFile = null;

        if (selectNum == 1) {
            getFile = readFile();
            getResult(getFile);
            userSelect.close();
        } else if (selectNum == 2) {
            getFile = new Scanner(System.in);
            out.println("문자열을 입력하세요");
            getResult(getFile);
            userSelect.close();
        }
    }
}
