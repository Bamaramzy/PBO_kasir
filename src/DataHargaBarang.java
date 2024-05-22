public class DataHargaBarang {
    private String namaBarang;
    private double hargaBarang;

    public DataHargaBarang(String namaBarang, double hargaBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    @Override
    public String toString() {
        return "Nama Barang: " + namaBarang + "\nHarga Barang: " + hargaBarang;
    }
}
