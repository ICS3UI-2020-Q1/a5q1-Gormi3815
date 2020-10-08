import java.util.Scanner;
/** this program makes a multiplication table for the number that the user inputs
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number to create a multiplication table for");
    int number = input.nextInt();
    
    
    for (int count = 0; count < 12; count++){
      int endnum = number*count;
   System.out.println(count  + "x " + number + " =" + endnum);

  }
}
}
