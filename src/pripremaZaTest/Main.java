package pripremaZaTest;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Planina planina=new Planina("Stara Planina", "Srbija", 1500);

        ArrayList<Planinar>planinari=new ArrayList<>();
        planinari.add(new RekreativniPlaninar("11","Milos", "Krstic",
                15,"Novi Sad",1800));
        planinari.add(new RekreativniPlaninar("12","Marko", "Krstic",
                20,"Novi Sad",2000));
        planinari.add(new RekreativniPlaninar("13","Borislav", "Krstic",
                25,"Novi Sad",2400));

        planinari.add(new Alpinista("126", "Ivan", "Jovanovic",
                45));
        planinari.add(new Alpinista("127", "Marija", "Ilic",
                41));
        planinari.add(new Alpinista("128", "Ivan", "Markovic",
                14));

        int ukupnaClanarina = 0;
        for (Planinar planinar : planinari) {
            planinar.stampaj();
            if (planinar.uspesanUspon(planina)) {
                System.out.println("Uspsan uspon!");
            } else {
                System.out.println("Neuspesan uspon!");
            }
            ukupnaClanarina += planinar.clanarina();
        }

        System.out.println(ukupnaClanarina);

    }
}
