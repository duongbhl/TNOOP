package hust.soict.dsai.aims.store;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore=new ArrayList<>();
    public void addDVD(DigitalVideoDisc item){
        itemsInStore.add(item);
        System.out.println("Added DVD");
    }
    public void removeDVD(DigitalVideoDisc item){
        itemsInStore.remove(item);
        System.out.println("Removed DVD");
    }
    public void printDVD(){
        System.out.println("*******************************");
        for(DigitalVideoDisc item : itemsInStore){
            System.out.println(item);
        }
        System.out.println("*******************************");
    }

}
