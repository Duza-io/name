import java.util.*;

public class App {
  //scanner for this specific class file
  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    //test test test
    String greet = "\nWelcome to my program!";

    for (int i = 0; i < greet.length(); i++) {
      System.out.print(greet.charAt(i));
      Thread.sleep(100);
    }

    String[] enteredName = new String[3];

    System.out.println("\nEnter three names: \n");

    for (int i = 0; i < enteredName.length; i++) {
      System.out.print("Enter name: ");
      String name = input.nextLine();

      while (name.isEmpty()) {
        System.out.print("This field is cannot be empty, try again: ");
        name = input.nextLine();
      }
      enteredName[i] = name;
    }

    /*
    for (int i = 0; i < enteredName.length; i++) {
      System.out.println(enteredName[i]);
    }
    */

    List<String> combination = new ArrayList<>();

    for (int i = 0; i < enteredName.length - 1; i++) {
      for (int j = i + 1; j < enteredName.length; j++) {
        combination.add(enteredName[i] + " " + enteredName[j]);
        combination.add(enteredName[j] + " " + enteredName[i]);
      }
    }

    System.out.println("\nSix possible names:");
    int number = 0;
    //foreach loop
    for (String output : combination) {
      number++;
      System.out.println(number + ": " + output);
      Thread.sleep(1000);
    }
  }
}
