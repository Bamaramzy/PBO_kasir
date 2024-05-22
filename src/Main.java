import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Daftar Barang
        DataHargaBarang[] daftarBarang = {
                new DataHargaBarang("Cappucino", 25000),
                new DataHargaBarang("Marimas", 12000),
                new DataHargaBarang("Teh Jus", 10000),
                new DataHargaBarang("Indomie Goreng", 3500),
                new DataHargaBarang("Sedaap Goreng", 4000),
                new DataHargaBarang("Sarimie", 3000),
                new DataHargaBarang("Mami Popo", 10000),
                new DataHargaBarang("Rokok Surya", 20000),
        };

        System.out.println("** Program Data Harga Barang dengan Periode Promosi **");
        System.out.println();

        //Menampilkan Barang
        System.out.println("Daftar Barang:");
        for (int i = 0; i < daftarBarang.length; i++) {
            System.out.println((i + 1) + ". " + daftarBarang[i].getNamaBarang() + " - Rp " + daftarBarang[i].getHargaBarang());
        }

        //Memilih Barang
        System.out.print("Pilih nomor barang: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); //Newline yang tersisa

        if (pilihan < 1 || pilihan > daftarBarang.length) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        //Mengambil Barang Yang Dipilih
        DataHargaBarang dataBarang = daftarBarang[pilihan - 1];

        //Menampilkan Data Barang
        System.out.println("\nData Barang");
        System.out.println(dataBarang);

        //Periode Promosi
        System.out.println("\nApakah Ingin Menghitung Harga Dengan Diskon (Y/N)?");
        String pilihanPromosi = scanner.nextLine().toUpperCase();

        if (pilihanPromosi.equals("Y")) {
            System.out.print("Masukkan Persentase Diskon (Contoh: 30): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Input Tidak Valid. Masukkan Angka Untuk Persentase Diskon:");
                scanner.next();
            }
            double diskon = scanner.nextDouble();

            //Objek PeriodePromosi
            PeriodePromosi periodePromosi = new PeriodePromosi(dataBarang.getNamaBarang(), dataBarang.getHargaBarang(), diskon);

            //Menampilkan Data Barang Dengan Diskon
            System.out.println("\nData Barang Dengan Diskon:");
            System.out.println(periodePromosi);
        } else {
            System.out.println("\nHarga Barang Tidak Diubah.");
        }

        scanner.close();
    }
}
