
import java.util.Scanner;

public class Menentukantotal {

   public static void main (String[] args){
      Scanner input = new Scanner(System.in);

      String menikah;
      int gajipokok,tunjangananak;

      NilaiGaji hitung= new NilaiGaji();
      
      System.out.print( "Masukkan golongan karyawan Anda: ");

      gajipokok = input.nextInt();

      System.out.println( "Apakah sudah menikah? (y/n): ");

      String menikahh = input.next();

      System.out.println ( "Masukan jumlah anak: ");

      int anak = input.nextInt();

      System.out.println("Gaji Pokok \t\t: " + hitung.cekgolgaji(gajipokok));

      System.out.println("Tunjangan Istri \t: " +hitung.ceknikah( menikahh)*hitung.cekgolgaji(gajipokok));

      System.out.println("Tunjangan Anak \t\t: " + hitung.cekanak(anak));

      double total = hitung.cekgolgaji(gajipokok) + (hitung.ceknikah(menikahh)*hitung.cekgolgaji(gajipokok))+hitung.cekanak(anak);
      
      System.out.println("Total Gaji\t\t: " + total);


 
}
   }

