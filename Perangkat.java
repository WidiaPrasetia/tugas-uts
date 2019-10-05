
package app;

public class Perangkat extends Anggota {

    public int periode; 
    int tanggalMenjabat;
    int tglSelesai;

    String membuatLaporan() {
        return "Membuat Laporan";
    }

    String menghapusLaporan() {
        return "Menghapus Laporan";
    }
    
}