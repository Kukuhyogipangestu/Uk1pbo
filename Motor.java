class Motor extends Kendaraan {
    private String merek;

    public Motor(String nama, String merek) {
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
        System.out.println("Motor memiliki 2 ban");
    }
}
