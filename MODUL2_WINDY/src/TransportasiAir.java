public class TransportasiAir {
    
    protected int jumlahkursi;
    protected int biaya;

    public TransportasiAir(int jumlahkursi, int biaya) {
        this.jumlahkursi = jumlahkursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Trasportasi Air jenis tidak diketahui dengan kursi berjumlah"+jumlahkursi+" "+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Trasnsportasi air dengan jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Trasnsportasi air dengan jenis tidak diketahui sedang berlabuh");
    }

    
}
