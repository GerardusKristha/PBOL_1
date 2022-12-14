package Praktikum1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Makanan extends Barang{
    private String kadaluwarsa;
    private String asalMakanan;

    public String getKadaluwarsa() {
        return kadaluwarsa;
    }

    public void setKadaluwarsa(String kadaluwarsa) {
        this.kadaluwarsa = kadaluwarsa;
    }

    public String getAsalMakanan() {
        return asalMakanan;
    }

    public void setAsalMakanan(String asalMakanan) {
        this.asalMakanan = asalMakanan;
    }
    
    public String toString(){
        return super.toString()+"(Kadaluwarsa : " + kadaluwarsa+ " | Asal Makanan : "+asalMakanan+")\n";
    }

}
