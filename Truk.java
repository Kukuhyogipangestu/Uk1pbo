class Truk extends Kendaraan {
    private String merek;

    public Truk(String nama, String merek) {
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
        System.out.println("Truk memiliki 6 ban");
    }

}
