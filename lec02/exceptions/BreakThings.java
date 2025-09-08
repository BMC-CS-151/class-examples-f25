import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BreakThings {

  //TODO 1: Let's go through line by line... what will happen?
  //TODO 2: Fix to avoid any exceptions
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(new File("NotARealFile.txt")); //1 - file doesnt exist

    String arg1 = args[0]; // 2 - AOB 
    System.out.println("Cmd line argument " + arg1);

    //Object broken = null;
    //System.out.println(broken.toString());
    
    int reallyBroken = 100 / 0;
  }
}
