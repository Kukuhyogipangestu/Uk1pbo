class Pesawat extends Trasnumum {
    private int penumpang;

    public Pesawat(String nama, int penumpang) {
        super(nama);
        this.penumpang = penumpang;
    }

    public int getPenumpang() {
        return this.penumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void perjalanan() {
        System.out.println("Pesawat melakukan perjalanan udata");
    }
}
