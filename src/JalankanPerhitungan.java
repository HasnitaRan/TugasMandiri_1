import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4,6,0);
        System.out.println(s.PrintJudul("Judul Dalam Interface"));

        int hasiltambah;
        hasiltambah = s.HitungTambah(4,6);
        System.out.println(hasiltambah);
        System.out.println(s.HitungTambah(4,6));
        System.out.println();

        int hasilkali;
        hasilkali = s.HitungKali(4,6);
        System.out.println(hasilkali);
        System.out.println(s.HitungKali(4,6));

    }
}
