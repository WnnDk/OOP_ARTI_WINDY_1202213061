import java.util.Scanner;

public class GajiPegawai {

  public static int gajiKaryawan(int golongan) {
    switch (golongan) {
      case 1:
        return 3000000;
      case 2:
        return 4000000;
      case 3:
        return 5000000;
      case 4:
        return 6000000;
      default:
        return 0;
    }
  }

  public static void main(String[] args) {
    int golongan, anak;
    double tunjanganIstri = 0, tunjanganAnak, gajiPokok, gajiAkhir;
    String pernikahan;

    Scanner input = new Scanner(System.in);

    // Meminta karyawan memasukkan golongan karyawan
    System.out.print("Masukkan golongan karyawan Anda: ");

    // Mendapatkan golongan karyawan
    golongan = input.nextInt();

    // Meminta karyawan memasukkan status pernikahannya
    System.out.print("Masukkan status pernikahan Anda (ya/tidak): ");

    // Mendapatkan status pernikahan
    pernikahan = input.next();

    // Meminta karyawan memasukkan jumlah anak
    System.out.print("Masukkan jumlah anak Anda: ");

    // Mendapatkan jumlah anak
    anak = input.nextInt();

    // Menghitung gaji pokok
    gajiPokok = gajiKaryawan(golongan);

    // Menghitung tunjangan istri
    switch (pernikahan){
        case "ya":
            tunjanganIstri = gajiPokok*0.2;
    }

    // Menghitung jumlah anak
    anak = anak > 3 ? 3 : anak;

    // Menghitung tunjjangan untuk anak
    tunjanganAnak = anak * 150000;

    // Menampilkan total gaji
    gajiAkhir = gajiPokok + tunjanganIstri + tunjanganAnak;

    // Menampilkan hasil
    System.out.println("Gaji Pokok Anda: Rp" + gajiPokok);
    System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
    System.out.println("Tunjangan Istri: Rp" + tunjanganIstri);
    System.out.println("=> Gaji Anda seluruhnya: Rp" + gajiAkhir);

    // Menutup input
    input.close();
  }
}
