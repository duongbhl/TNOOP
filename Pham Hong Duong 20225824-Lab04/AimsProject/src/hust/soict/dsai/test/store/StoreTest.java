package hust.soict.dsai.test.store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dv1=new DigitalVideoDisc("Titanic","Drama","Duong",100,19);
        store.addDVD(dv1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addDVD(dvd2);
        store.removeDVD(dv1);
        store.printDVD();
    }
}
