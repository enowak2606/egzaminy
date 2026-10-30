import java.util.Objects;

public class Osoba {
    private int id;
    private String imie;
    public static int instancje=0;

    public Osoba(){
        this.id=0;
        this.imie="";
        instancje++;
    }
    public Osoba(int id, String imie){
        this.id=id;
        this.imie=imie;
        instancje++;
    }
    public Osoba(Osoba osoba){
        this.id=osoba.id;
        this.imie=osoba.imie;
        instancje++;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void wypiszImie(String twojeImie){
        if(!Objects.equals(this.imie, "") && !Objects.equals(this.imie, null)){
            System.out.println("Cześć "+ twojeImie + ", mam na imie " + this.imie);
        }else{
            System.out.println("Brak danych");
        }
    }
}
