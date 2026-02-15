public class Sungai{ //class yg dipilih
    int id;
    String nama_sungai, lokasi, status;

    //membuat set- method
    public void setnama(String nama_sungai){
        this.nama_sungai = nama_sungai;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void getId(int id){
        this.id = id;
    }
    public void setLokasi(String lokasi){
       this.lokasi = lokasi;
    }

    //method buat tampil data set-
    public void showdata(){
        System.out.println("nama sungai : "+nama_sungai);
        System.out.println("ID sungai : "+id);
        System.out.println("lokasi sungai : "+lokasi);
        System.out.println("status sungai : "+status);
    }
    
    //panggil method untun di run
    public static void main (String[]args){
        Sungai sungaiobj = new Sungai();

        sungaiobj.setnama("citarum");
        sungaiobj.setLokasi("jawa Barat");
        sungaiobj.getId(1);
        sungaiobj.setStatus("BERSIH");
        sungaiobj.showdata();
        
    }
    
}