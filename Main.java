/**
 * Created by lenovo on 7/6/2015.
 */
public class Main {
    public static void main(String[] args) {

        //Liga
        Liga Brawijaya = new Liga("Brawijaya");

        //Divisi
        Divisi Kesehatan = new Divisi("divisi Kesehatan",Brawijaya);
        Divisi Teknik = new Divisi("Teknik",Brawijaya);

        //Club
        Club Gizi = new Club("Gizi",Kesehatan,Brawijaya);
        Club Perawat = new Club("Perawat",Kesehatan,Brawijaya);
        Club Mesin = new Club("Mesin",Teknik,Brawijaya);
        Club Industri = new Club("Industri",Teknik,Brawijaya);

        Brawijaya.setDaftarDivisi(Kesehatan);
        Brawijaya.setDaftarDivisi(Teknik);

        Kesehatan.setDaftarClub(Gizi);
        Kesehatan.setDaftarClub(Perawat);
        Teknik.setDaftarClub(Mesin);
        Teknik.setDaftarClub(Industri);

        //1. Get daftar Divisi by nama Liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Brawijaya : ");
        Brawijaya.getDaftarDivisi("Brawijaya");
        System.out.println();

        //2. Get Daftar Club by nama Liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Brawijaya : ");
        Kesehatan.getDaftarClubLiga("Brawijaya");
        System.out.println();

        //3. Get Daftar Club by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Kesehatan : ");
        Kesehatan.getDaftarClubDivisi("Kesehatan");
        System.out.println("Teknik : ");
        Teknik.getDaftarClubDivisi("Teknik");
        System.out.println();

        //4. Get Club ini berada di Divisi apa by nama Club

        System.out.println("Soal Nomer 4 :");
        Gizi.getDivisi("Gizi");
        Perawat.getDivisi("Perawat");
        System.out.println();

        //5. Get Club ini berada di Liga apa by nama Club

        System.out.println("Soal Nomer 5 :");
        Perawat.getLiga("Perawat");
    }
}
