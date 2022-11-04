import java.util.Scanner;

public class JFO6PRACTICE2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan pilih angka yang diinginkan: ");
        int angka = sc.nextInt();
        for(int i = 1; i <= 12; i++){
            System.out.println("\n"+angka+"x"+i+"="+angka*i);
        }
       
    }

}
