public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahkursi,int biaya, int layar){
        super(jumlahkursi,biaya);
        this.layar = layar;

    }
    @Override
    public void informasi(){
        System.out.println("Trasportasi Air jenis sampan dengan kursi berjumlah"+jumlahkursi+" "+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    @Override
    public void berlayar(int layar){
        System.out.println("Trasnsportasi air dengan jenis Sampan sedang berlayar menggunakan"+" "+ layar+"jangkar");
    }
    @Override
    public void berlabuh(){
        System.out.println("Trasnsportasi air dengan jenis Sampan sedang berlabuh tanpa jangkar");
    }
    
    public void berlabuh(int banyakjangkar){
        System.out.println("Trasnsportasi air dengan jenis Sampan sedang berlabuh menggunakan"+" "+banyakjangkar+" "+"jangkar");
    }
    
}
