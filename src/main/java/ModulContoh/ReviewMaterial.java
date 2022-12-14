package ModulContoh;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class ReviewMaterial {
    public static void main(String[] args) {
        Kelas pbo2 = new Kelas();
        pbo2.setNama("Pemrograman Berorientas Objek 2");
        
        Dosen dosen = new Dosen();
        dosen.setNama("Robertus Adi N.");
        dosen.setNip("2208");
        
        pbo2.setDosen(dosen);
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Udin");
        mhs1.setNim("155314002");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Ucok");
        mhs2.setNim("155314002");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNama("Ali");
        mhs3.setNim("155314003");
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNama("Umar");
        mhs4.setNim("155314004");
        Mahasiswa mhs5 = new Mahasiswa();
        mhs5.setNama("Siti");
        mhs5.setNim("155314005");
                
        Mahasiswa[] listMhs = new Mahasiswa[5];
        listMhs[0] = mhs1;
        listMhs[1] = mhs2;
        listMhs[2] = mhs3;
        listMhs[3] = mhs4;
        listMhs[4] = mhs5;
        
        pbo2.setListMahasiswa(listMhs);
        
        System.out.println("Kelas: " + pbo2.getNama());
        System.out.println("DOsen: " + pbo2.getDosen().getNama()+"("+pbo2.getDosen().getNip()+")");
        System.out.println("Mahasiswa: ");
        for(int i = 0; i<pbo2.getListMahasiswa().length;i++){
            Mahasiswa mhs = pbo2.getListMahasiswa()[i];
            System.out.println((i+1)+". "+mhs.getNama()+ "("+mhs.getNim()+")");
        }
    }
}
