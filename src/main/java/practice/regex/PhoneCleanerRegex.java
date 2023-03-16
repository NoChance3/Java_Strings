package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static String number(String input) {
    input = input.replaceAll("[^0-9]","");
    if (input.matches("7[0-9]{10}")){
      return input;
    }
    else if (input.matches("8[0-9]{10}")) {
      input = input.replaceFirst("8", "7");
      return input;
    }
    else if (input.matches("9[0-9]{9}")) {
      input = input.replaceFirst("9", "79");
      return input;
    }
    else if (input.matches("[0-9]{12,}")){
      return "Неверный формат номера";
    }
    else if(input.matches("[^7-8][0-9]{10}")){
      return "Неверный формат номера";
    }
    else if(input.matches("[0-9]{2,10}")){
      return "Неверный формат номера";
    }
    else return "";
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      System.out.println(number(input));
      if (input.equals("0")) {
        scanner.close();
        break;
      }


    }
  }

}
