package apteka;

public class Lekarstwo {

    String id;
    String nazwa;
    String[] sklad;
    String[] przeciwskazania;
    String kategoria;
    String cena;

    public Lekarstwo(String id, String nazwa, String[] sklad, String[] przeciwskazania, String kategoria, String cena) {

        this.id = id;
        this.nazwa = nazwa;
        this.sklad = sklad;
        this.przeciwskazania = przeciwskazania;
        this.kategoria = kategoria;
        this.cena = cena;
    }

    public Lekarstwo(String id, String nazwa, String[] sklad, String kategoria, String cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.sklad = sklad;
        this.kategoria = kategoria;
        this.cena = cena;
    }

}
