package pripremaZaTest;

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUspon;
    private static final int clanarina=1000;

    public RekreativniPlaninar(){

    }

    public RekreativniPlaninar(String id, String imePlaninara, String prezimePlaninara, int tezinaOpreme,
                               String nazivOkruga, int maksimalniUspon) {
        super(id, imePlaninara, prezimePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaksimalniUspon() {
        return maksimalniUspon;
    }

    public void setMaksimalniUspon(int maksimalniUspon) {
        this.maksimalniUspon = maksimalniUspon;
    }

    public double clanarina() {
        return clanarina;
    }

    public void stampaj () {
        System.out.println("Rekreativac, id: " + getId() + "\n" + "ime: " + getImePlaninara()
                + " " +getPrezimePlaninara()  + " Okrug: " + nazivOkruga);
    }
    public boolean uspesanUspon(Planina planina) {
        if (maksimalniUspon - (tezinaOpreme * 50) > planina.getVisinaPlanine()) {
            return true;
        } else {
            return false;
        }
    }
}
