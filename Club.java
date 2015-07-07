/**
 * Created by lenovo on 6/30/2015.
 */
public class Club {
    private String namaClub;
    private Divisi divisi;
    private Liga liga;

    //Constructor

    public Club(String namaClub, Divisi divisi, Liga liga) {
        this.namaClub = namaClub;
        this.divisi = divisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaClub(String namaClub) {

        this.namaClub = namaClub;
    }

    public String getNamaClub() {

        return namaClub;
    }

    public void setDivisi(Divisi divisi) {

        this.divisi = divisi;
    }

    //test nomor 4
    public void getDivisi(String Club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarClub.size(); c++){
                a.daftarClub.get(c);
                Club i = a.daftarClub.get(c);
                if (Club == i.getNamaClub()){
                    System.out.println(a.getNamaDivisi());
                }
            }
        }
    }

    public void setLiga(Liga liga) {

        this.liga = liga;
    }

    //test nomor 5
    public void getLiga (String club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Divisi a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarClub.size(); c++){
                a.daftarClub.get(c);
                Club i = a.daftarClub.get(c);
                if (club == i.getNamaClub()){
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }

    //toString
    @Override
    public String toString() {
        return "Nama Club = " + namaClub;
    }
}
