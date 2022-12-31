// Realisé par :  Younes Sghyer
import java.util.Scanner;

class Main {

  public static boolean si_nombre(String s) {  // Fonction qui vérifier est ce que la valeur entrée  nombre ou non 
    try {
        Integer.parseInt(s);
        return true;
    }catch (NumberFormatException e) {
        return false;
    }
  }

  public static int forcNumeric(String s) {  // Fonction qui forcer un nombre de type string à un nombre de type integer
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
    // Pr tache : La vérification (Implémentation de la méthode isNumeric()) est ce que le nombre qui va entrer de type int ou non 
    do {
     
      System.out.println("Enter a number ");
      inpu_str = input.nextLine();
      test = si_nombre(inpu_str); 

    } while (test != true);
        // dm tache :  (Implémentation de la méthode forcNumeric()) pour rendre le nombre de type string à un entier 
         inpu = forcNumeric(inpu_str);
    
        // 1 : si les valeurs qu'on a entrées est compatible avec les excigences qu'on a fait , les tests suivants seront exécutés [Félicitations : hhh]   
    for (i = inpu; i >= 1; i--) {
       System.out.println(tt.repeat(i) + "_/");
    }

  }
}
