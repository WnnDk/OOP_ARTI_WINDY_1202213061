package MODUL3_WINDY.kalkulator;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner inputsc = new Scanner(System.in);
    Calculation kalku = new Calculation();

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int pilihan = inputsc.nextInt();

        switch (pilihan) {
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double sisi = inputsc.nextDouble();
            kalku.setSquare(sisi);
            kalku.run();
            System.out.println("\nOperate Success The calculation result: " + kalku.getSquare());
            break;
          case 2:
            System.out.print("\nEnter the radius of the circle : ");
            double radius = inputsc.nextDouble();
            kalku.setCircle(radius);
            kalku.run();
            System.out.println("\nOperate Success The calculation result: " + kalku.getCircle());
            break;
          case 3:
            System.out.print("\nEnter the upper side of the trapezoid : ");
            double s1 = inputsc.nextDouble();
            System.out.print("Insert the side of the base of the trapezoid : ");
            double s2 = inputsc.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double t = inputsc.nextDouble();
            kalku.setTrapezoid(s1, s2, t);
            kalku.run();
            System.out.println("\nOperate Success The calculation result: " + kalku.getTrapezoid());
            break;
          case 0:
            System.out.println("\n===End the Program===");
            break;
          default:
            System.out.println("\nOption not available");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input must be a number====");
        inputsc.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    inputsc.close();
  }
}

