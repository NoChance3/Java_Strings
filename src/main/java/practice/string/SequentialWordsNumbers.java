package practice.string;

import java.util.Scanner;


public class SequentialWordsNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(sequentialWordsNumbers(text));
    }






    public static String sequentialWordsNumbers(String text) {
        int start = 0;
        int end;
        int num = 1;
        String endText = "";
        boolean spase = text.isEmpty();
        if (!spase) {
            endText = "(1) ";
        }
        for (int i = 0; i < text.length(); i++) {
            end = i;
            if (text.charAt(i) == ' ') {
                while (start < end) {
                    endText = endText.concat(String.valueOf(text.charAt(start)));
                    start++;
                }
                num++;
                endText = endText.concat(" (" + num + ")");
            }
            while (start <= end) {
                endText = endText.concat(String.valueOf(text.charAt(start)));
                start++;
            }
        }
        return endText;

    }
}