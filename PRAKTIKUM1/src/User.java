import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat Datang di Restoran EAD");

        System.out.println("Silahkan register terlebih dahulu");

        System.out.println("========================================");

        System.out.println("Name: ");
        
        String nama = sc.next();

        System.out.println("Phone Number:");

        int nomorhp = sc.nextInt();

        System.out.println("=============================================");

        if (nama == "Windy_SI4501" || nomorhp == 1202213061){
            System.out.println("Register successfull");
            System.out.println("NAMA: "+nama+"\n");
            System.out.println("Phone number: "+nomorhp+"\n");
        }




    
    }
    



    

   

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}





