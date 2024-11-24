package hust.soict.dsai.test.disc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");


        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());


        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("amount:"+cinderellaDVD.getId());
        DigitalVideoDisc dv3=new DigitalVideoDisc("Dv3");
        System.out.println("dv3 title: "+dv3.getId());
    }
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void swap1(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        DigitalVideoDisc tmp = new DigitalVideoDisc(o1);
        o1.setTitle(o2.getTitle());
        o1.setCategory(o2.getCategory());
        o1.setLength(o2.getLength());
        o1.setDirector(o2.getDirector());
        o1.setCost(o2.getCost());
        o2.setTitle(tmp.getTitle());
        o2.setCategory(tmp.getCategory());
        o2.setLength(tmp.getLength());
        o2.setDirector(tmp.getDirector());
        o2.setCost(tmp.getCost());
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
        dvd.setNbDigitalVideoDiscs(dvd.getNbDigitalVideoDiscs()-1);
    }



}
