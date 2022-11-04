


public class Ceknilai {
    public int cekgolongan(String gajipokok){
        if (gajipokok.equals("a")){
            return 3000000;
        } else if (gajipokok.equals("b")){
            return 4000000;
        } else if (gajipokok.equals("c")){
            return 5000000;
        } else if (gajipokok.equals("d")){
            return 6000000;
        }
        return 0;
    }
    public double ceknikah(String menikah){
        if (menikah.equals("Ya")){
            return 0.2;
        } else if (menikah.equals("Tidak")){
            return 0;
        }
        return 0;
    }
    public int cekanak(int anak){
        if (anak > 3){
            return 3 * 150000;
        } else if (anak >= 0 & anak <=3 )
            return anak * 150000;
        return 0;
        }
}
