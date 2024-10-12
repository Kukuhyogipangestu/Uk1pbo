class Kereta extends Trasnumum {
    private int penumpang;

    public Kereta(String nama, int penumpang) {
        super(nama);
        this.penumpang = penumpang;
    }

    public int getPenumpang() {
        return this.penumpang;
    }

    public void setpPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void perjalanan() {
        System.out.println("Kereta melakukan perjalanan darat");
    }
}
