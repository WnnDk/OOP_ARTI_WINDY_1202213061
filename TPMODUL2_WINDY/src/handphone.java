public class handphone extends perangkat{
    protected boolean fingerprint;
    public handphone (String drive, int ram, float processor,boolean fingerprint){
        super(drive,ram,processor);
        this.fingerprint = fingerprint; 
    }
    
    public void informasi() {
        System.out.println("Handphone ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
                + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu handphone ini "+ (fingerprint == false ? "Tidak memiliki " : "memiliki ") + "fingeprint");
    }
    public void telfon(int noHP) {
        System.out.println("Handphone berhasil menyambungkan telfon ke No " + noHP);
    }

    public void kirimSMS(int noHP) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noHP);
    }

    public void manyMessage(int noHP, int noHP2) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noHP + " " + "dan " + noHP2);
    }
}