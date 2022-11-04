import java.util.Scanner;

public class JFO6PRACTICE1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;

        System.out.println("Masukan pin anda: ");
        int kode = sc.nextInt();
        while(kode != pin) {
            System.out.println("Pin yang anda masukan salah! coba lagi: ");
            kode = sc.nextInt();
        }
        System.out.println("Pin anda benar selamat datang");
    }
}
