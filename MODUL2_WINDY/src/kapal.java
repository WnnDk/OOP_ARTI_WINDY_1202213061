public class kapal extends TransportasiAir {
    protected String mesin;
    public kapal (int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi,biaya);
        this.mesin = mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Trasportasi Air jenis sampan dengan kursi berjumlah"+jumlahkursi+" "+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Trasnsportasi air dengan jenis Sampan sedang berlayar dengan kecepatan yang tidak stabil");
    }
    
    public void berlayar(int kecepatan){
        System.out.println("Trasnsportasi air dengan jenis Sampan sedang berlayar dengan kecepatan stabil di kisaran"+" "+kecepatan+" "+"knot");
    }
    
    public void berlabuh(){
        System.out.println("Trasnsportasi air dengan jenis Sampan sedang berlabuh menggunakan di pantai");
    }

    
}
