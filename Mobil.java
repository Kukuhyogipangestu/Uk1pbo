class Mobil extends Kendaraan {
    private String merek;

    public Mobil(String nama, String merek) {
        super(nama);
        this.merek = merek;
    }

    public String getMerek() {
        return this.merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void ban() {
        System.out.println("Mobil memiliki 4 ban");
    }
}
