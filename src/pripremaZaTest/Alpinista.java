package pripremaZaTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Alpinista extends Planinar{
    private int brojPoena;

    public Alpinista() {
    }

    public Alpinista(String id, String imePlaninara, String prezimePlaninara, int brojPoena) {
        super(id, imePlaninara, prezimePlaninara);
        this.brojPoena = brojPoena;
    }
    public void stampaj(){
        System.out.println("Alpinista, id: " + getId() + "\n" + "ime: " + getImePlaninara() + " " + getPrezimePlaninara()
        + "\nBroj poena: " + brojPoena);
    }

    public double clanarina() {
        int clanarina=1500-(brojPoena*50);
        if(clanarina>0){
            return clanarina;
        } else {
            return 0;
        }
    }

    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine()<=4000) {
            return true;
        } else {
            return false;
        }
    }

}
