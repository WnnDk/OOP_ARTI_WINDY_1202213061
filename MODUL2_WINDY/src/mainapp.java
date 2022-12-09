public class mainapp {
   public static void main (String[]args){
    TrasportasiAir TransportasiAir = new TransportasiAir(10,30000);

    TrasportasiAir.informasi();
    TrasportasiAir.berlayar();
    TrasportasiAir.berlabuh();

    System.out.println();

    Sampan sampan = new Sampan(15, 35000, 3);

    sampan.informasi();
    sampan.berlayar();
    sampan.berlabuh();
    sampan.berlabuh(3);

    System.out.println();

    kapal kapal = new kapal (20,25000, "diesel");

    kapal.informasi();
    kapal.berlayar();
    kapal.berlayar(30);
    sampan.berlabuh();



   }

}
