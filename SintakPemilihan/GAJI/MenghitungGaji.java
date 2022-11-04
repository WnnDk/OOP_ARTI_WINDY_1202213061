

import java.util.Scanner;

public class MenghitungGaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menikah,gajipokok;
        int anak;

        Ceknilai hitung = new Ceknilai();
        System.out.println("Masukkan Golongan Gaji Pokok Anda :");
        gajipokok  = sc.next();

        System.out.println("Masukkan Status Menikah : Ya/Tidak");
        menikah  = sc.next();

        System.out.println("Masukkan Jumlah Anak : ");
        anak  = sc.nextInt();

        System.out.println("Gaji Pokok \t\t: " + hitung.cekgolongan(gajipokok));

        System.out.println("Tunjangan Istri \t: " +hitung.ceknikah(menikah)*hitung.cekgolongan(gajipokok));

        System.out.println("Tunjangan Anak \t\t: " + hitung.cekanak(anak));

        double total = hitung.cekgolongan(gajipokok) + (hitung.ceknikah(menikah)*hitung.cekgolongan(gajipokok))+hitung.cekanak(anak);
        System.out.println("Total Gaji\t\t: " + total);
    }
    
}
