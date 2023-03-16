package practice.regex;
import java.util.Scanner;

public class SplitText {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    if (!text.isEmpty()) {
      System.out.println(splitTextIntoWords(text));
    }
  }

  public static String splitTextIntoWords(String text) {
    String[] words = text.split("\s+");
    String endText = "";
    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].replaceAll("[^a-zA-Z]", "");
      if ( !words[i].isEmpty()){
        endText = endText.concat("\n" + words[i]);
      }
    }
    return endText.replaceFirst("\n", "");
  }

}
