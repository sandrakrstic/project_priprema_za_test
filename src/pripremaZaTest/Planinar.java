package pripremaZaTest;

public abstract class Planinar {
    private String id;
    private String imePlaninara;
    private String prezimePlaninara;

    public Planinar(){

    }

    public Planinar(String id, String imePlaninara, String prezimePlaninara) {
        this.id = id;
        this.imePlaninara = imePlaninara;
        this.prezimePlaninara = prezimePlaninara;
    }

    public String getId() {
        return id;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public String getPrezimePlaninara() {
        return prezimePlaninara;
    }

    public abstract void stampaj();

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);

}
