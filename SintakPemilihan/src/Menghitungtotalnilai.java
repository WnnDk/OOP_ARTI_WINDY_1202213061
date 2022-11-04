import java.util.Scanner;
public class Menghitungtotalnilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nilai Tubes : ");

        float n_Tubes = input.nextInt();

        System.out.println("Nilai Tugas : ");

        float n_Tugas = input.nextInt();

        System.out.println("Nilai Quiz : ");

        float n_Quiz = input.nextInt();

        System.out.println("Nilai UTS : ");

        float n_UTS = input.nextInt();

        System.out.println("Nilai UAS : ");

        float n_UAS = input.nextInt();
        double totalnilai;
        
        //membuat objek dari class Hitungnilai
        Hitungnilai objekhitung = new Hitungnilai();
        totalnilai =objekhitung.hitungtubes(n_Tubes)+objekhitung.hitungtugas(n_Tugas)+objekhitung.hitungquiz(n_Quiz)+objekhitung.hitungUTS(n_UTS)+objekhitung.hitungUAS(n_UAS);
        System.out.println( "Nilai Total adalah  "+ totalnilai);
        
        //membuat objek dari class tentukanhurufmutu
        tentukanhurufmutu objekhr = new tentukanhurufmutu(totalnilai);
        
        System.out.println("Huruf Mutu "+objekhr.hurufmutu());
        
    }
    
}
