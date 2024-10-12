import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("===== INPUT =====");
        System.out.println();

        System.out.print("Masukkan nama mobil: ");
        String namaMobil = input.nextLine();
        System.out.print("Masukkan merek mobil: ");
        String merekMobil = input.nextLine();

        System.out.print("Masukkan nama motor: ");
        String namaMotor = input.nextLine();
        System.out.print("Masukkan merek motor: ");
        String merekMotor = input.nextLine();

        System.out.print("Masukkan nama truk: ");
        String namatruk = input.nextLine();
        System.out.print("Masukkan merek truk: ");
        String warnatruk = input.nextLine();

        System.out.print("Masukkan jenis pesawat: ");
        String namaPesawat = input.nextLine();
        System.out.print("Masukkan tinggi pesawat: ");
        int penumpangPesawat = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jenis Kereta: ");
        String namaKereta = input.nextLine();
        System.out.print("Masukkan tinggi pesawat: ");
        int penumpangKereta = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jenis Kapal: ");
        String namaKapal = input.nextLine();
        System.out.print("Masukkan tinggi pesawat: ");
        int penumpangKapal = input.nextInt();
        input.nextLine();

        System.out.println();
        System.out.println("======= Output =======");
        System.out.println();

        Kendaraan mobil = new Mobil(namaMobil, merekMobil);
        Kendaraan motor = new Motor(namaMotor, merekMotor);
        Kendaraan truk = new Truk(namatruk, warnatruk);

        System.out.println("nama mobil saya " + mobil.getNama() + ", merek: " + ((Mobil)mobil).getMerek());
        mobil.ban();
        
        System.out.println("nama motor saya " + motor.getNama() + ", merek: " + ((Motor)motor).getMerek());
        motor.ban();

        System.out.println("nama truk saya " + truk.getNama() + ", merek: " + ((Truk)truk).getMerek());
        truk.ban();

        System.out.println();
        Trasnumum pesawat = new Pesawat(namaPesawat, penumpangPesawat);
        Trasnumum kereta = new Kereta(namaKereta, penumpangKereta);
        Trasnumum kapal = new Kapal(namaKapal, penumpangKapal);

        System.out.println("saya menaiki pesawat " + pesawat.getNama() + ", dengan jumlah penumpang " + ((Pesawat)pesawat).getPenumpang());
        pesawat.perjalanan();

        System.out.println("saya menaiki Kereta " + kereta.getNama() + ", dengan jumlah penumpang " + ((Kereta)kereta).getPenumpang());
        kereta.perjalanan();

        System.out.println("saya menaiki Kapal " + kapal.getNama() + ", dengan jumlah penumpang " + ((Kapal)kapal).getPenumpang());
        kapal.perjalanan();
    }
}
