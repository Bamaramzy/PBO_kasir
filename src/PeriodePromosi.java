public class PeriodePromosi extends DataHargaBarang {
    private double diskon;

    public PeriodePromosi(String namaBarang, double hargaBarang, double diskon) {
        super(namaBarang, hargaBarang);
        this.diskon = diskon;
    }

    public double getHargaSetelahDiskon() {
        return getHargaBarang() - (getHargaBarang() * diskon / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDiskon: " + diskon + "%\nHarga Setelah Diskon: " + getHargaSetelahDiskon();
    }
}
