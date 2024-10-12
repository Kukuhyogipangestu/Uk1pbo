class Kendaraan {
    private String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void ban() {
        System.out.println("Kendaraan memiliki jumlah Ban");
    }
}
