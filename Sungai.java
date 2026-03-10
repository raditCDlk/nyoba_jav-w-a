
public class Sungai { // parent class

    public int id;
    public String nama_sungai, lokasi;

    public void setId(int id) {
        this.id = id;
        System.out.println("Id Sungai : " + id);
    }

    public void setNama(String nama_sungai) {
        this.nama_sungai = nama_sungai;
        System.out.println("Nama Sungai : " + nama_sungai);
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
        System.out.println("Lokasi Sungai : " + lokasi);
    }

    public void getkategori(String kategori) {
    }

    public void getStatus(String status) {
    }

    public static void main(String[] args) {
        Sungai sungaiobj = new Sungai();
        
        sungaiobj.setId(1);
        sungaiobj.setNama("citarum");
        sungaiobj.setLokasi("jawa Barat");

        KategoriSungai kategoriSungai = new KategoriSungai();

        kategoriSungai.setKategori("layak pakai");

        StatusSungai statusSungai = new StatusSungai();

        statusSungai.setStatus("sungai Bersih");
    }
}
