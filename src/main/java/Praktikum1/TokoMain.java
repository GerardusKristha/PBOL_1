package Praktikum1;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class TokoMain {
    public static void main(String[] args) {
        Pakaian pakaian1 = new Pakaian();
        pakaian1.setId("0010");
        pakaian1.setName("kaos");
        pakaian1.setUkuran("M");
        pakaian1.setWarnaDasar("putih");
        pakaian1.setPrice(30000);
        
        Pakaian pakaian2 = new Pakaian();
        pakaian2.setId("0110");
        pakaian2.setName("kemeja");
        pakaian2.setUkuran("L");
        pakaian2.setWarnaDasar("hijau");
        pakaian2.setPrice(250000);
        pakaian2.setDiscount(0.25);
        
        Makanan makanan1 = new Makanan();
        makanan1.setId("2001");
        makanan1.setName("Indomie");
        makanan1.setAsalMakanan("indonesia");
        makanan1.setKadaluwarsa("12/02/2023");
        makanan1.setPrice(3500);
        
        Obat_obatan obat1 = new Obat_obatan();
        obat1.setId("3100");
        obat1.setName("Tolak Angin");
        obat1.setKadaluwarsa("10/01/2023");
        obat1.setDosis(1);
        obat1.setPrice(36000);
        
        Barang[] barangInput = new Barang[4];
        barangInput[0] = pakaian1;
        barangInput[1] = pakaian2;
        barangInput[2] = makanan1;
        barangInput[3] = obat1;
        
        System.out.println("Toko SuperMurah");
        System.out.println("Barang input : ");
        for(int i =0; i<barangInput.length;i++){
            System.out.println(barangInput[i]);
        }
    }
}
