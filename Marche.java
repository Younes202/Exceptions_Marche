import java.util.Scanner;

class Main {

  public static boolean si_nombre(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static int forcNumeric(String s) {
    return Integer.parseInt(s);

  }

  public static String repeat(int count, String rep) {
    return rep.repeat(count);
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int i, inpu;
    String tt = "\t", inpu_str;
    boolean test = true;

    do {
      System.out.println("Enter a number ");
      inpu_str = input.nextLine();
      test = si_nombre(inpu_str);

    } while (test != true);

    inpu = forcNumeric(inpu_str);

    for (i = inpu; i >= 1; i--) {
      System.out.println(tt.repeat(i) + "_/");
    }

  }
}
