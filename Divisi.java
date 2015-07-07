import java.util.ArrayList;

/**
 * Created by lenovo on 6/30/2015.
 */
public class Divisi {
    private String namaDivisi;
    private Liga liga;
    ArrayList<Club> daftarClub = new ArrayList<Club>();

    //Constructor
    public Divisi(String namaDivisi, Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaDivisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {

        return namaDivisi;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Liga getLiga(){
        return liga;
    }

    public void setDaftarClub(Club club) {

        this.daftarClub.add(club);
    }

    public ArrayList<Club> getDaftarClub() {

        return daftarClub;
    }

    //test nomor 2

    public void getDaftarClubLiga(String cariLiga)
    {
        if (cariLiga == liga.getNamaLiga())
        {
            for (int i = 0; i < liga.daftarDivisi.size() ; i++)
            {
                Divisi l = liga.daftarDivisi.get(i);
                System.out.println(l.getNamaDivisi());
                for (int j = 0; j <daftarClub.size() ; j++)
                {
                    System.out.println(l.daftarClub.get(j));
                }
            }
        }
        else
        {
            System.out.println("Tidak ada Club di Liga ini");
        }
    }

    //test nomor 3
    public void getDaftarClubDivisi(String divisiCari)
    {
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Divisi l = liga.daftarDivisi.get(i);
            if (divisiCari == l.getNamaDivisi())
            {
                for (int j = 0; j <daftarClub.size() ; j++)
                {
                    System.out.println(l.daftarClub.get(j));
                }
            }
        }
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Divisi l = liga.daftarDivisi.get(0);
            Divisi k = liga.daftarDivisi.get(1);
            if (divisiCari != k.getNamaDivisi())
            {
                if (divisiCari != l.getNamaDivisi())
                {
                    System.out.println("Club tidak dapat ditemukan");
                    break;
                }
            }
        }

    }

    //toString
    @Override
    public String toString() {
        return
                "Nama Divisi = " + namaDivisi;
    }
}
