package Praktikum1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Obat_obatan extends Barang{
    private String kadaluwarsa;
    private int dosis;
    
    public String getKadaluwarsa(){
        return kadaluwarsa;
    }
    
    public void setKadaluwarsa(String kadaluwarsa){
        this.kadaluwarsa = kadaluwarsa;
    }
    
    public int getDosis(){
        return dosis;
    }
    
    public void setDosis(int dosis){
        this.dosis=dosis;
    }
    
    public String toString(){
        return super.toString()+"(Kadaluwarsa : " + kadaluwarsa+ " | Dosis per hari : "+dosis+")\n";
    }
}
