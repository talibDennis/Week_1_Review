
import java.util.Scanner;
import java.util.Random;

public class ParkTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random randNum = new Random();

    int randomAge = randNum.nextInt(10) + 1; // 0-9, +1 is called a shift value

    System.out.printf("Random value of : %d%n", randomAge);
    
    input.close();
  } // main
} // class