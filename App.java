package app;


public class App {
    public static void main(String[] args) throws Exception {
        Anggota anggota1 = new Anggota();
        anggota1.nama = "Prass";
        anggota1.noAnggota = 41830009;

        Ketua pengurus1 = new Ketua();
        pengurus1.nama = "Widia";
        pengurus1.noAnggota = 41830020;
        pengurus1.periode = 2019;

        

        Panitia panitia1 = new Panitia();
        panitia1.nama = "Putu";
        panitia1.noAnggota = 41830030;
        panitia1.periode = 2021;
        panitia1.melihatAnggaran();
        
                     
    
        System.out.println(anggota1.nama);
        System.out.println(anggota1.noAnggota);
        System.out.println("\n");
        System.out.println(pengurus1.nama);
        System.out.println(pengurus1.noAnggota);
        System.out.println(pengurus1.periode);
        System.out.println("\n");
        System.out.println(panitia1.nama);
        System.out.println(panitia1.noAnggota);
        System.out.println(panitia1.periode);
    }
}