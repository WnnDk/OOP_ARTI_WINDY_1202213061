import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Restaurant restaurant = new Restaurant();
            int CustomerID, OrderQty;
            try{

                System.out.println("Enter Customer ID: ");
                CustomerID = sc.nextInt();

                System.out.println("Enter how much Food to make: ");
                OrderQty = sc.nextInt();

                Thread tr1 = new Thread(restaurant);
                Waiters waiter = new Waiters(CustomerID, OrderQty);
                Thread tr2 = new Thread(waiter);

                tr1.start();
                tr2.start();
                tr1.join();
                tr2.join();

            }catch(Exception e){
                System.out.println("!!!Input must be integer!!!");
            }
        }
    
    }

    
}


