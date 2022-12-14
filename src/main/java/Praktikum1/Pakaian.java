package Praktikum1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Pakaian extends Barang{
    private String ukuran;
    private String warnaDasar;
    private double discount;

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarnaDasar() {
        return warnaDasar;
    }

    public void setWarnaDasar(String warnaDasar) {
        this.warnaDasar = warnaDasar;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public int getPrice(){
        return (int)(super.getPrice()-(1*discount));
    }
    
    public String toString(){
        return super.toString()+"(Ukuran : " + ukuran+ " | Warna Dasar : "+
                warnaDasar+" | Discount : "+ discount+" | Harga akhir : "+ getPrice()+")\n";
    }
    
}
