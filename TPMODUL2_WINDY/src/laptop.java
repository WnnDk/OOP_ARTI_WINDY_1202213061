public class laptop extends perangkat{
    protected boolean webcam;
    public laptop(String drive, int ram, float processor, boolean webcam){
        super(drive,ram,processor);
        this.webcam= webcam;
    }
    public void informasi() {
        System.out.println("Laptopp ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
                + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu Laptop ini "+ (webcam == false ? "Tidak memiliki " : "memiliki ") + "webcam");
    }

    public void bukaGame(String gamename) {
        System.out.println("Laptop berhasil membuka game " + gamename);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    public void multiEmail(String email, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email + " " + "dan ke " + email2);
    }
}
