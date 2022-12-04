public class mainapp {
    public static void main(String [] args) {
        perangkat perangkat = new perangkat("Samsung", 16, 4.6f);
        perangkat.informasi();
    
        System.out.println();
    
        handphone handphone = new handphone("DDR5", 16, 5, false);
        handphone.informasi();
        handphone.telfon(625651685);
        handphone.kirimSMS(62932266);
        handphone.manyMessage(628955135, 627986465);
    
        System.out.println();
    
        laptop laptop = new laptop("SODIMM", 32, 4.8f, false);
        laptop.informasi();
        laptop.bukaGame("Genshin Impact");
        laptop.kirimEmail("Wnndddk84@gmail.com");
        laptop.multiEmail("Wnndddk84@gmail.com", "Wnndddk48@gmail.com");
    }
        
}
    

