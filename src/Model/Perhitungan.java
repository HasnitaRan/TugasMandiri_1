package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a, int _b, int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudulClass("Print judul dalam Class Perhitungan");
    }

    private void printJudulClass(String jdl) {
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul Dalam Interface");
    }

    @Override
    public void HitungTambah() {
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        this.hasil = this.a * this.b;
    }

    public int Penjumlahan(int c, int d){
        this.a=c;
        this.b=d;
        HitungTambah();
        return this.hasil;
    }
    public int Perkalian(int e, int f){
        this.a=e;
        this.b=f;
        return this.hasil;
    }
}
