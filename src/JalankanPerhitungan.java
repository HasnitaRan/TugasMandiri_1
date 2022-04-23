import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4,6,0);
        s.PrintJudul();
        int hasilTambah = s.Penjumlahan(4,6);
        System.out.println("Hasil Penjumlahan = " + hasilTambah);
        int hasilKali = s.Perkalian(4,6);
        System.out.println("Hasil Perkalian = " + hasilKali);
    }
}
